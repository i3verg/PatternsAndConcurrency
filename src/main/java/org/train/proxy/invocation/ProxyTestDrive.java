package org.train.proxy.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTestDrive {
    PersonBean vasya = new PersonBeanImpl("Vasya", 0, 0);
    OwnerInvocationHandler ownerInvocationHandler = new OwnerInvocationHandler(vasya);
    NonOwnerInvocationHandler nonOwnerInvocationHandler = new NonOwnerInvocationHandler(vasya);

    public static void main(String[] args) {
        ProxyTestDrive testDrive = new ProxyTestDrive();
        testDrive.drive();
    }

    public void drive() {

        PersonBean ownerProxy = getProxy(vasya, ownerInvocationHandler);
        System.out.println("Name is " + ownerProxy.getName());

        try {
            ownerProxy.setHotOrNoRating(5);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner");
        }

        System.out.println("Rating is : " + vasya.getHotOrNoRating());

        PersonBean nonOwnerProxy = getProxy(vasya, nonOwnerInvocationHandler);
        System.out.println("Name is : " + ownerProxy.getName());

        try {
            nonOwnerProxy.setName("Petya");
        } catch (Exception e) {
            System.out.println("can't set name from nonOwner");
        }

        nonOwnerProxy.setHotOrNoRating(15);
        System.out.println("Rating is : " + ownerProxy.getHotOrNoRating());

    }

    public static PersonBean getProxy(PersonBean personBean, InvocationHandler invocationHandler) {

        InvocationHandler handler;

        if (invocationHandler.getClass().equals(OwnerInvocationHandler.class)) {
            handler = new OwnerInvocationHandler(personBean);
        } else {
            handler = new NonOwnerInvocationHandler(personBean);
        }

        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                handler);
    }
}
