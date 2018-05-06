package com.xiaoyuervae.java8_learning.responsebilityChainMode;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午5:52
 */
public class ChainClient {

    public static void main(String[] args) {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();

        p1.setSuccessor(p2);

        String result = p1.handle("Aren't labdas really sexy?!!");
    }

    public void lamdaMode() {

        UnaryOperator<String> headerProcessing = (String text) -> "From Raoul, Mario and Alan: " + text;

        UnaryOperator<String> spellCheckerProcessing = (String text) -> text.replaceAll("labda", "lambda");

        Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);

        String result = pipeline.apply("Aren't labdas really sexy?!!");
    }

}
