package com.xiaoyuervae.java8_learning.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午4:54
 */
public class Feed implements Subject{

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObserver(String tweet) {
        this.observers.forEach(o -> {
            o.notify(tweet);
        });
    }
}
