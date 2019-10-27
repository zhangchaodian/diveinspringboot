package com.imooc.diveinspringboot.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.Environment;


/**
 * Before {@link ConfigFileApplicationListener} 实现.
 * 详细：
 *
 * @author Created on 2019.10.27 by chaodian
 */
public class BeforeConfigFileApplicationListener implements SmartApplicationListener, Ordered {


    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent preparedEvent = (ApplicationEnvironmentPreparedEvent) event;
            Environment environment = preparedEvent.getEnvironment();
            // 以下涉及到外部化配置，后面再理解
            System.out.println("environment.getProperty(\"name\")" + environment.getProperty("name"));
        }
        if (event instanceof ApplicationPreparedEvent) { }
    }

    @Override
    public int getOrder() {
        // 比ConfigFileApplicationListener优先级更高
        return ConfigFileApplicationListener.DEFAULT_ORDER + 1;
    }
}
