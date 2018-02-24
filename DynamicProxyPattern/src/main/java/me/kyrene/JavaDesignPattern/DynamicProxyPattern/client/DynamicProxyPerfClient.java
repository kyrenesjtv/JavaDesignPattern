package me.kyrene.JavaDesignPattern.DynamicProxyPattern.client;

import me.kyrene.JavaDesignPattern.DynamicProxyPattern.proxy.cglibproxy.SubjectInterceptor;
import me.kyrene.JavaDesignPattern.DynamicProxyPattern.proxy.jdkproxy.SubjectProxyHandler;
import me.kyrene.JavaDesignPattern.DynamicProxyPattern.subject.ISubject;
import me.kyrene.JavaDesignPattern.DynamicProxyPattern.subject.impl.ConcreteSubject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wanglin on 2018/2/24.
 */
public class DynamicProxyPerfClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(DynamicProxyPerfClient.class);
    private static int creation = 100000000;
    private static int execution = 1000000000;
    public static void main(String[] args) {
        testJDKDynamicCreation();
        testJDKDynamicExecution();
        testCglibCreation();
        testCglibExecution();
    }

    private static void testJDKDynamicCreation() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < creation; i++) {
            InvocationHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
            Proxy.newProxyInstance(DynamicProxyPerfClient.class.getClassLoader(),
                    new Class[] {ISubject.class}, handler);
        }
        long stop = System.currentTimeMillis();
        LOGGER.info("JDK creation time : {} ms", stop - start);
    }
    private static void testJDKDynamicExecution() {
        long start = System.currentTimeMillis();
        InvocationHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
        ISubject subject =
                (ISubject) Proxy.newProxyInstance(DynamicProxyPerfClient.class.getClassLoader(),
                        new Class[] {ISubject.class}, handler);
        for (int i = 0; i < execution; i++) {
            subject.action();
        }
        long stop = System.currentTimeMillis();
        LOGGER.info("JDK execution time : {} ms", stop - start);
    }
    private static void testCglibCreation() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < creation; i++) {
            MethodInterceptor methodInterceptor = new SubjectInterceptor();
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(ConcreteSubject.class);
            enhancer.setCallback(methodInterceptor);
            enhancer.create();
        }
        long stop = System.currentTimeMillis();
        LOGGER.info("cglib creation time : {} ms", stop - start);
    }
    private static void testCglibExecution() {
        MethodInterceptor methodInterceptor = new SubjectInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ConcreteSubject.class);
        enhancer.setCallback(methodInterceptor);
        ISubject subject = (ISubject) enhancer.create();
        long start = System.currentTimeMillis();
        for (int i = 0; i < execution; i++) {
            subject.action();
        }
        long stop = System.currentTimeMillis();
        LOGGER.info("cglib execution time : {} ms", stop - start);
    }
}
