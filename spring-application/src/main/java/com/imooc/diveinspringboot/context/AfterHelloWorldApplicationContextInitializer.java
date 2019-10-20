package com.imooc.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * 功能：The type After hello world application context initializer.
 * 详细：
 *
 * @author Created on 2019.10.20 by chaodian
 */

public class AfterHelloWorldApplicationContextInitializer implements ApplicationContextInitializer, Ordered {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("After application.id = " + applicationContext.getId());
    }


    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
