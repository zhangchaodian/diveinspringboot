package com.imooc.diveinspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link SpringApplication} 引导类
 *
 * @author Created on 2019.10.10 by chaodian
 */
// @SpringBootApplication
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
        // SpringApplication.run(SpringApplicationBootstrap.class, args);

        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springApplication = new SpringApplication();
        // 注意sources可以是多种bean来源来替代，比如a class name, package name, or an XML resource location
        springApplication.setSources(sources);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        // run是可以返回context，是由BeanDefinitionLoader来进行加载的
        ConfigurableApplicationContext context = springApplication.run(args);
        System.out.println("Bean : " + context.getBean(ApplicationConfiguration.class));
        // SpringApplication.run(ApplicationConfiguration.class, args);
    }


    @SpringBootApplication
    public static class ApplicationConfiguration {

    }
}
