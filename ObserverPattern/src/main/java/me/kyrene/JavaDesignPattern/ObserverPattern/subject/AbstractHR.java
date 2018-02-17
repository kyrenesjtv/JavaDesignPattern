package me.kyrene.JavaDesignPattern.ObserverPattern.subject;

import me.kyrene.JavaDesignPattern.ObserverPattern.observer.ITalent;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by wanglin on 2018/2/17.
 */
public abstract  class AbstractHR {

    protected Collection<ITalent> allTalents = new ArrayList<ITalent>();

    public abstract void publishJob(String job);

    public void addTalent(ITalent talent) {
        allTalents.add(talent);
    }
    public void removeTalent(ITalent talent) {
        allTalents.remove(talent);
    }

}
