package org.train.proxy.impl;

import org.train.proxy.domain.MyTestRemote;

import java.rmi.Naming;

public class MyTestRemoteClientImpl {
    public static void main(String[] args) {
        MyTestRemoteClientImpl.go();
    }
    public static void go(){
        try {
            MyTestRemote testRemote = (MyTestRemote) Naming.lookup("rmi://127.0.0.1/RemoteService");
            String s = testRemote.sayHello();
            System.out.println(s);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
