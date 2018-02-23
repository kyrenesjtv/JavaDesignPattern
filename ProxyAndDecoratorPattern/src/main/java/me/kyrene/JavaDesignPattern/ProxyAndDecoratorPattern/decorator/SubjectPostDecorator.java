package me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.decorator;

import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.subject.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/23.
 */
public class SubjectPostDecorator implements ISubject {
    private static final Logger LOGGER = LoggerFactory.getLogger(SubjectPostDecorator.class);

    private ISubject subject;

    public SubjectPostDecorator(ISubject subject) {
        this.subject = subject;
    }
    @Override
    public void action() {
        postAction();
        subject.action();
    }
    private void postAction() {
        LOGGER.info("SubjectPostDecorator.postAction()");
    }
}
