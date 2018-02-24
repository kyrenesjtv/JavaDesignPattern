package me.kyrene.JavaDesignPattern.DynamicProxyPattern.proxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by wanglin on 2018/2/24.
 */
public class SubjectInterceptor implements MethodInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubjectInterceptor.class);

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        preAction();
        Object result = methodProxy.invokeSuper(o, objects);
        postAction();
        return result;
    }
    private void preAction() {
          //  LOGGER.info("SubjectProxyHandler.preAction()");
    }

    private void postAction() {
            //LOGGER.info("SubjectProxyHandler.postAction()");
    }
}
