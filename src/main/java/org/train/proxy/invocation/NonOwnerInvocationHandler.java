package org.train.proxy.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                method.invoke(personBean, objects);
            } else if (method.getName().equals("setHotOrNoRating")) {
                method.invoke(personBean, objects);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }

    PersonBean getProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }


}
