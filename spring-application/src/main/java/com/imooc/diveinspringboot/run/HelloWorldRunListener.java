package com.imooc.diveinspringboot.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class HelloWorldRunListener implements SpringApplicationRunListener {

    /**
     * 构造函数的实现也是模仿的EventPublishingRunListener，不管有无具体实现，都得在这里声明下，否则启动会报错
     * @param application
     * @param args
     */
    public HelloWorldRunListener(SpringApplication application, String[] args) {
    }

    @Override
    public void starting() {
        System.out.println("HelloWorldRunListener.starting.....");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
