package me.kyrene.JavaDesignPattern.ObserverPattern.subject.impl;

import me.kyrene.JavaDesignPattern.ObserverPattern.subject.AbstractHR;

/**
 * Created by wanglin on 2018/2/17.
 */
public class HeadHunter extends AbstractHR {

    @Override
    public void publishJob(String job) {
        allTalents.forEach(talent -> talent.newJob(job));
    }
}
