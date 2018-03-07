package com.xiaoyuervae.java8_learning.optional;

import jdk.nashorn.internal.runtime.options.Option;
import jdk.nashorn.internal.runtime.options.OptionTemplate;
import org.apache.ibatis.jdbc.Null;

import java.util.Optional;

/**
 * User: guanchun.yu
 * Date: 2018/3/3
 * Time: 下午10:30
 */
public class OptionalTemplate {

    /**
     * Optional中或许包含了指向非空变量的引用（Present）, 或者什么都没有包含（absent）
     */
    private static void template1() {

        Optional<Integer> canBeEmpty = Optional.of(5);

        System.out.println(canBeEmpty.isPresent());

        System.out.println(canBeEmpty.get());

        Optional<Integer> canBeEmpty1 = Optional.empty();

        System.out.println(canBeEmpty1.isPresent());

        //System.out.println(canBeEmpty1.get()); // 会直接报错: java.util.NoSuchElementException: No value present

        Optional<Integer> possible = Optional.of(null); // 会抛出 NullException

    }

    public static void template2() {
        Optional<Integer> possible = Optional.ofNullable(null);

        System.out.println(possible.isPresent());

        Optional<Integer> possible2 = Optional.ofNullable(5);

        System.out.println(possible2.isPresent());

        possible2.ifPresent(System.out::println);

        possible.ifPresent(System.out::println);
    }

    public static void template3() {

        Optional<Company> companyOptional = Optional.empty();

        Company company = companyOptional.orElse(new Company());

        Company company1 = companyOptional.orElseThrow(IllegalStateException::new);

        companyOptional.filter( department -> "Developer".equals(department.getDepartment()))
                .ifPresent(System.out::println);

}


    public static void main(String[] args) {
        //OptionalTemplate.template1();

        //OptionalTemplate.template2();

        OptionalTemplate.template3();
    }

}
