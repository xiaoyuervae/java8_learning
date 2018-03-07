package com.xiaoyuervae.java8_learning.functional_interface;

/**
 * User: guanchun.yu
 * Date: 2018/3/3
 * Time: 下午10:20
 */
@FunctionalInterface
public interface MyFunctionalInterface {

    /**
     * 用来通知编译器该接口中仅有一个抽象方法
     */
    void onlyFunction();

    /**
     * 重载的 java.lang.Object 的方法不计入该接口的抽象方法的个数里面
     * @return
     */
    @Override
    String toString();

    @Override
    boolean equals(Object o);

}
