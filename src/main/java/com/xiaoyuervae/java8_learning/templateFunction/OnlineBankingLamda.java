package com.xiaoyuervae.java8_learning.templateFunction;

import javax.annotation.Resource;
import java.util.function.Consumer;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午4:39
 */
public class OnlineBankingLamda {

    @Resource
    private CustomerMapper customerMapper;

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer c = customerMapper.getCustomerById(id);
        makeCustomerHappy.accept(c);
    }

}
