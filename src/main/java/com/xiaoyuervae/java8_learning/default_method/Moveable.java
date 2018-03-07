package com.xiaoyuervae.java8_learning.default_method;

public interface Moveable {

    /**
     * java8中引入默认方法是为了使用lamda表达式
     */
    default void move() {
        System.out.println("I am moving");
    }

}
