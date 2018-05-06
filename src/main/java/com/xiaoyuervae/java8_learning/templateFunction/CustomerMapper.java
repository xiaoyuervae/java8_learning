package com.xiaoyuervae.java8_learning.templateFunction;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午4:42
 */
@Component
public interface CustomerMapper {

    Customer getCustomerById(int id);

}
