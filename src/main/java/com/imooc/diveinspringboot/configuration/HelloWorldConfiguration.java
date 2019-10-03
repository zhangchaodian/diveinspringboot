package com.imooc.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;

/**
 * 功能：HelloWorld 配置.
 * 详细：
 *
 * @author Created on 2019.10.03 by chaodian
 */
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello,World 2018";
    }
}
