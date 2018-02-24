package me.kyrene.JavaDesignPattern.DynamicProxyPattern.client;

import me.kyrene.JavaDesignPattern.DynamicProxyPattern.proxy.cglibproxy.SubjectInterceptor;
import me.kyrene.JavaDesignPattern.DynamicProxyPattern.subject.ISubject;
import me.kyrene.JavaDesignPattern.DynamicProxyPattern.subject.impl.ConcreteSubject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Created by wanglin on 2018/2/24.
 */
public class CgLibProxyClient {

    public static void main(String[] args) {
        MethodInterceptor interceptor = new SubjectInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ConcreteSubject.class);
        enhancer.setCallback(interceptor);
        ISubject subject = (ISubject) enhancer.create();
        subject.action();
    }
}
