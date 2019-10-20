package com.imooc.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;


/**
 * 功能：The type Hello world application context initializer.
 * 详细：
 *
 * @param <C> the type parameter
 * @author Created on 2019.10.20 by chaodian
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C applicationContext) {
        System.out.println("ConfigurableApplicationContext.id() = " + applicationContext.getId());
    }
}
