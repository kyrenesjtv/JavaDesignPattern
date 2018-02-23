package me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.decorator;

import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.subject.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/23.
 */
public class SubjectPreDecorator implements ISubject {
    private static final Logger LOGGER = LoggerFactory.getLogger(SubjectPreDecorator.class);

    private ISubject subject;

    public SubjectPreDecorator(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        preAction();
        subject.action();
    }

    private void preAction() {
        LOGGER.info("SubjectPreDecorator.preAction()");
    }

}
