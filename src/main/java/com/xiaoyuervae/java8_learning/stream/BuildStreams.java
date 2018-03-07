package com.xiaoyuervae.java8_learning.stream;

import java.io.InputStream;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * User: guanchun.yu
 * Date: 2018/3/7
 * Time: 上午10:15
 */
public class BuildStreams {

    public static void main(String[] args) {
        //BuildStreams.buildStream1();
        //BuildStreams.convertToCollections();
        //BuildStreams.coreOperations();
        //BuildStreams.terminalOperation();
        //BuildStreams.shortCircuit();
        BuildStreams.parallelStream();
    }

    private static void buildStream1() {
        /**
         * 使用stream.of()
         */
        //Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //stream.forEach(p -> System.out.println(p));

        /**
         * 使用stream.of(ArrayElements)
         */
        //Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9});
        //stream.forEach(p -> System.out.println(p));

        /**
         * 使用someList.stream
         */
        //List<Integer> list = new ArrayList<>();
        //for (int i = 1; i < 10; i++) {
        //    list.add(i);
        //}
        //
        //Stream<Integer> stream = list.stream();
        //stream.forEach(p -> System.out.println(p));

        /**
         * 使用stream.generate 或者 stream.iterate() function
         */
        //Stream<Date> stream = Stream.generate(Date::new);
        //stream.forEach(p -> System.out.println(p));

        /**
         * 使用stream chars 或者String tokens
         */
        //IntStream stream = "12345_abcdefg".chars();
        //stream.forEach(p -> System.out.println(p));

        Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
        stream1.forEach(p -> System.out.println(p));
    }

    private static void convertToCollections() {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        /**
         * 使用stream.collect(Collectors.toList) 转换 Stream to List
         */
        //List<Integer> evenNumberList = stream.filter(i -> i%2 == 0)
        //        .collect(Collectors.toList());
        //System.out.println(evenNumberList);

        /**
         * 使用stream.toArray(EntryType[]::new)将stream 转换陈个数组
         */
        Integer[] integers = stream.filter(i -> i % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println(integers);

    }

    private static void coreOperations() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        // filter 流的操作是中间的, 这使得我们能够对结果调用另外一个流操作
        memberNames.stream().filter(s -> s.startsWith("A"))
                .forEach(System.out::println);

        // map() 通过给定的功能将每个元素转换成另一个对象
        memberNames.stream().filter(p -> p.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // sorted 返回流的排序视图 只会创建流的排序视图 无需操作后续集合的排序 成员名称的顺序是不变的
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void terminalOperation() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        // forEach 有助于地带流的所有元素
        //memberNames.forEach(System.out::println);

        // collect 用于从一个stream 中接收元素 并将它们存储在一个集合中, 并通过参数分类
        List<String> memNamesInUpperCase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // match 可以使用各种匹配操作检查某个断言条件是否与流匹配
        boolean matchedResult = memberNames.stream()
                .anyMatch(s -> s.startsWith("A"));

        matchedResult = memberNames.stream()
                .allMatch(s -> s.startsWith("A"));

        matchedResult = memberNames.stream()
                .noneMatch(s -> s.startsWith("A"));

        System.out.println(matchedResult);

        // count 是一个终端操作 将流中的元素的数量返回一个long 类型的值
        long totalMatched = memberNames.stream().filter(s -> s.startsWith("A"))
                .count();

        System.out.println(totalMatched);

        // reduce 使用给定的函数来对流的元素进行操作 返回值类型是Optional
        Optional<String> reduced = memberNames.stream()
                .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

    }

    /**
     * 在匹配元素的时候通常希望终端操作
     */
    private static void shortCircuit() {

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        // anyMatch
        boolean matched = memberNames.stream()
                .anyMatch(s -> s.startsWith("A"));

        // findFirst 将从流中返回第一个元素, 然后不处理任何元素
        memberNames.stream().filter(s -> s.startsWith("L"))
                .findFirst()
                .ifPresent(System.out::println);
    }

    /**
     * parallel 并行
     */
    private static void parallelStream() {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }

}
