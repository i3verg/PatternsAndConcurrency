package org.train.proxy.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTestDrive {
    public static void main(String[] args) {

    }

    public static PersonBean getProxy(PersonBean personBean, InvocationHandler invocationHandler){

        InvocationHandler handler;

        if(invocationHandler.getClass().equals(OwnerInvocationHandler.class)){
            handler = new OwnerInvocationHandler(personBean);
        } else {
            handler = new NonOwnerInvocationHandler(personBean);
        }

        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                handler);

    }
}
