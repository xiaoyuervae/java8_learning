package com.xiaoyuervae.java8_learning.StrategyDesignModeFor8;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午12:15
 */
public class StrategyClient {

    public static void main(String[] args) {
        Validator numericValidator = new Validator((String s) -> s.matches("[a-z]+"));
        numericValidator.validate("aaa");
    }

}
