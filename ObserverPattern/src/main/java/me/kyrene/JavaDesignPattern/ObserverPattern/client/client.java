package me.kyrene.JavaDesignPattern.ObserverPattern.client;

import me.kyrene.JavaDesignPattern.ObserverPattern.observer.impl.Architect;
import me.kyrene.JavaDesignPattern.ObserverPattern.observer.impl.JuniorEngineer;
import me.kyrene.JavaDesignPattern.ObserverPattern.observer.impl.SeniorEngineer;
import me.kyrene.JavaDesignPattern.ObserverPattern.subject.AbstractHR;
import me.kyrene.JavaDesignPattern.ObserverPattern.subject.impl.HeadHunter;

/**
 * Created by wanglin on 2018/2/17.
 */
public class client {

    public static void main(String[] args) {
        Architect architect = new Architect();
        JuniorEngineer juniorEngineer = new JuniorEngineer();
        SeniorEngineer seniorEngineer = new SeniorEngineer();

        AbstractHR subject = new HeadHunter();
        subject.addTalent(architect);
        subject.addTalent(juniorEngineer);
        subject.addTalent(seniorEngineer);

        subject.publishJob("have new job...welcome call 11111");
    }
}
