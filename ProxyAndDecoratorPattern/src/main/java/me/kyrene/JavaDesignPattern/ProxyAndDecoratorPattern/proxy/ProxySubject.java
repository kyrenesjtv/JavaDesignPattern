package me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.proxy;

import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.subject.ISubject;
import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.subject.impl.ConcreteSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Created by wanglin on 2018/2/23.
 */
public class ProxySubject implements ISubject {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProxySubject.class);

    private ISubject iSubject;

    public ProxySubject(){
        iSubject = new ConcreteSubject();
    }

    @Override
    public void action() {
        preAction();

        if((new Random()).nextBoolean()){//生成一个随机的boolean对象
            iSubject.action();
        }else {
            LOGGER.info("Permission denied");
        }
        postAction();
    }
    private void preAction() {
        LOGGER.info("ProxySubject.preAction()");
    }

    private void postAction() {
        LOGGER.info("ProxySubject.postAction()");
    }
}
