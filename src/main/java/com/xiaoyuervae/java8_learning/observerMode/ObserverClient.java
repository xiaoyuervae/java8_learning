package com.xiaoyuervae.java8_learning.observerMode;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午4:54
 */
public class ObserverClient {

    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("money")){
                System.out.println("Breaking news in NY! " + tweet);
            }
        });

        f.registerObserver((String tweet) -> { if(tweet != null && tweet.contains("queen")){
            System.out.println("Yet another news in London... " + tweet);
        }
        });

        f.notifyObserver("The queen said her favourite book is Java 8 in Action!");
    }

}
