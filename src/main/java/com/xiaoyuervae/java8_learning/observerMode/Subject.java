package com.xiaoyuervae.java8_learning.observerMode;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午4:53
 */
public interface Subject {

    void registerObserver(Observer o);

    void notifyObserver(String tweet);

}
