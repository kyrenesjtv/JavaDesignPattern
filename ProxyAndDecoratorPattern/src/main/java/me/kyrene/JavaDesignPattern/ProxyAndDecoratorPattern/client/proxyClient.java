package me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.client;

import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.proxy.ProxySubject;

/**
 * Created by wanglin on 2018/2/23.
 */
public class proxyClient {
    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject();
        subject.action();
    }
}
