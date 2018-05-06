package com.xiaoyuervae.java8_learning.StrategyDesignModeFor8;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午12:13
 */
public class Validator {

    private ValidatorStrategy validatorStrategy;

    public Validator(ValidatorStrategy validatorStrategy) {
        this.validatorStrategy = validatorStrategy;
    }

    public boolean validate(String s) {
        return validatorStrategy.execute(s);
    }
}
