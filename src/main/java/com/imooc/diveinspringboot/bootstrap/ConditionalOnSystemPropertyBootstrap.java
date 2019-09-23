package com.imooc.diveinspringboot.bootstrap;


import com.imooc.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 功能：系统属性条件引导类.
 * 详细：
 *
 * @author Created on 2019.09.23 by chaodian
 */
// @ConditionalOnSystemProperty(name = "user.name", value = "抄点哥")
public class ConditionalOnSystemPropertyBootstrap {
    // 下面的bean不用在Bootstrap上进行注解@Configuraion，因为Builder直接注入了
    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "dillon")
    public String helloWorld() {
        return "Hello, World 抄点哥";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 如果@ConditionalOnSystemProperty的value是为dillon，则matches返回true，会注入到Spring容器，否则不会，会报找不到的这个helloWorld的异常
        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean:" + helloWorld);

        context.close();
    }
}
