package com.xiaoyuervae.java8_learning.factoryMode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午6:04
 */
public class ProductFactory {

    final static Map<String, Supplier<Product>> map = new HashMap<>();

    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
    }

    public static Product createProduct(String name) {
        Supplier<Product> p = map.get(name);
        if (p != null) p.get();
        throw new IllegalArgumentException("No Such Product " + name);
    }
}
