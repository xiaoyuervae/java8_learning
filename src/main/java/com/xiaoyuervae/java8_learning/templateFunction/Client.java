package com.xiaoyuervae.java8_learning.templateFunction;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午4:44
 */
public class Client {

    public static void main(String[] args) {
        new OnlineBankingLamda().processCustomer(123, (Customer c) -> {
            System.out.println("make customer happy");
        });
    }
}
