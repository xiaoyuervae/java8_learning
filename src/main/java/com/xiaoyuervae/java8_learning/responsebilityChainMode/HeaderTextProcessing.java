package com.xiaoyuervae.java8_learning.responsebilityChainMode;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午5:50
 */
public class HeaderTextProcessing extends ProcessingObject<String>{

    public String handleWork(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }

}
