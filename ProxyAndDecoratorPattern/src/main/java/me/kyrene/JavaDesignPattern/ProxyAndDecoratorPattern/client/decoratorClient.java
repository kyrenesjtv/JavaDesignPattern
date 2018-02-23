package me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.client;

import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.decorator.SubjectPostDecorator;
import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.decorator.SubjectPreDecorator;
import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.subject.ISubject;
import me.kyrene.JavaDesignPattern.ProxyAndDecoratorPattern.subject.impl.ConcreteSubject;

/**
 * Created by wanglin on 2018/2/23.
 */
public class decoratorClient {
    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();
        SubjectPreDecorator preDecorator = new SubjectPreDecorator(subject);
        SubjectPostDecorator postDecorator = new SubjectPostDecorator(subject);
        preDecorator.action();
        postDecorator.action();
    }
}
