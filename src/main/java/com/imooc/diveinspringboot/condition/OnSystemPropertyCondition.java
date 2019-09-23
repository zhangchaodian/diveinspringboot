package com.imooc.diveinspringboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 系统属性条件判断
 *
 * 模拟OnPropertyCondition，但是不用SpringBootCondition,
 * 而是用最原始的condition，主要是为了说明SpringBoot的很多重要特性来自于Spring Framework
 */
public class OnSystemPropertyCondition implements Condition {
    // 关于第二个参数AnnotatedTypeMetadata是可以获取注解类的所有信息
    // 关于第二个参数AnnotatedTypeMetadata是可以获取注解类的所有信息
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());


        String propertyName = String.valueOf(attributes.get("name"));
        String propertyValue = String.valueOf(attributes.get("value"));

        // System.getProperty是java的属性，通过断点输出是dillon, ConditionalOnSystemPropertyBootstrap引导类的加载是抄点哥，所以不会equals
        String javaPropertyValue = System.getProperty(propertyName);

        return propertyValue.equals(javaPropertyValue);
    }
}
