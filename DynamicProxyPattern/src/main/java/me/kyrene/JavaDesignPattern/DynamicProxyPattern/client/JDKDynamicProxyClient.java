package me.kyrene.JavaDesignPattern.DynamicProxyPattern.client;

import me.kyrene.JavaDesignPattern.DynamicProxyPattern.proxy.jdkproxy.SubjectProxyHandler;
import me.kyrene.JavaDesignPattern.DynamicProxyPattern.subject.ISubject;
import me.kyrene.JavaDesignPattern.DynamicProxyPattern.subject.impl.ConcreteSubject;

import java.lang.reflect.Proxy;

/**
 * Created by wanglin on 2018/2/24.
 */
public class JDKDynamicProxyClient {

    public static void main(String[] args) {
        SubjectProxyHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
        ISubject proxy = (ISubject) Proxy.newProxyInstance(JDKDynamicProxyClient.class.getClassLoader(), new Class[]{ISubject.class}, handler);
        proxy.action();
    }
}
