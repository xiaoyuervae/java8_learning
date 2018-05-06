package com.xiaoyuervae.java8_learning.responsebilityChainMode;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午5:52
 */
public class SpellCheckerProcessing extends ProcessingObject<String>{

    public String handleWork(String text){
        return text.replaceAll("labda", "lambda");
    }

}
