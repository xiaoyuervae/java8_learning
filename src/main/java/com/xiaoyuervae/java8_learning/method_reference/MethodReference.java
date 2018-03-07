package com.xiaoyuervae.java8_learning.method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: guanchun.yu
 * Date: 2018/3/1
 * Time: 下午10:56
 */
public class MethodReference {

    public static void main(String[] args) {
        //MethodReference.specificMethod();

        MethodReference.referenceConstructMethod();
    }

    /**
     * 引用特定类型的方法
     */
    private static void specificMethod() {
        List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sorted = strings
                .stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println(sorted);

        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(sortedAlt);
    }

    /**
     * 引用构造函数 Class::new
     */
    public static void referenceConstructMethod() {
        List<Integer> integers = IntStream
                .range(0, 100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(integers);

        Optional<Integer> max = integers
                .stream()
                .reduce(Math::max);

        max.ifPresent(System.out::println);
    }

}
