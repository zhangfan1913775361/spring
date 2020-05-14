package com.zfedu.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * Created by zhangfan 2020/5/14
 */

@Configuration
public class AppConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Lazy
    public Notepad3 notepad3(){
        return new Notepad3();
    }
}
