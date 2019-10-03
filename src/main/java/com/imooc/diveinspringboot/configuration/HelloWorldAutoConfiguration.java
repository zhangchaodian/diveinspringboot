package com.imooc.diveinspringboot.configuration;


import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import com.imooc.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * 功能：HelloWorld 自动装配.
 * 详细：
 *
 * @author Created on 2019.10.03 by chaodian
 */
@Configuration // Spring 模式注解
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "dillon") // 条件装配
public class HelloWorldAutoConfiguration {
}
