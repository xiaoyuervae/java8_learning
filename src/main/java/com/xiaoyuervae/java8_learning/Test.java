package com.xiaoyuervae.java8_learning;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * User: guanchun.yu
 * Date: 2018/2/9
 * Time: 下午2:19
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 433, 2, 98);

        Optional<Integer> max = integers.stream().reduce(Math::max);

        max.ifPresent(value -> System.out.print(value));
    }
}
