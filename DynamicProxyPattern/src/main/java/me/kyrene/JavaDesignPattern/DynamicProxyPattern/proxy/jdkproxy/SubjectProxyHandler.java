package me.kyrene.JavaDesignPattern.DynamicProxyPattern.proxy.jdkproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wanglin on 2018/2/24.
 */
public class SubjectProxyHandler implements InvocationHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubjectProxyHandler.class);

    private Object target ;

    public SubjectProxyHandler(Class clazz){
        try {
            this.target = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException  e) {
            LOGGER.error("Create proxy for {} failed", clazz.getName());
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preAction();
        Object result = method.invoke(target, args);
        postAction();
       // LOGGER.info("Proxy class name {}", proxy.getClass().getName());
        return result;
    }

    private void preAction() {
       // LOGGER.info("SubjectProxyHandler.preAction()");
    }

    private void postAction() {
        //LOGGER.info("SubjectProxyHandler.postAction()");
    }
}
