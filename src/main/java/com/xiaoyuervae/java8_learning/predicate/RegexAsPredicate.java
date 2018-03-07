package com.xiaoyuervae.java8_learning.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * User: guanchun.yu
 * Date: 2018/3/7
 * Time: 下午8:43
 */
public class RegexAsPredicate {

    public static void main(String[] args) {
        RegexAsPredicate.example1();
    }

    private static void example1() {
        Predicate<String> emailFilter = Pattern.compile("^(.+)@example.com$")
                .asPredicate();

        List<String> emails = Arrays.asList("alex@example.com", "bob@yahoo.com",
                "cat@google.com", "david@example.com");

        List<String> desiredEmails = emails.stream()
                .filter(emailFilter)
                .collect(Collectors.toList());

        desiredEmails.forEach(System.out::println);
    }
}
