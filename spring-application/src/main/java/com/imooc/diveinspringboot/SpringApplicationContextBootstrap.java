package com.imooc.diveinspringboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring 应用上下文 引导类.
 * 详细：
 *
 * @author Created on 2019.10.27 by chaodian
 */
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                // .web(WebApplicationType.REACTIVE)
                // .web(WebApplicationType.NONE)
                .run();


        System.out.println("ConfigurableApplicationContext 类型" + context.getClass().getName());
        System.out.println("Environment 类型" + context.getEnvironment().getClass().getName());

        // 关闭上下文
        context.close();
    }
}
