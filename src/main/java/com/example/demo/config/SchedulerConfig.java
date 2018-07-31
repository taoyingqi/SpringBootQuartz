package com.example.demo.config;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.quartz.Scheduler;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.autoconfigure.quartz.SchedulerFactoryBeanCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import javax.sql.DataSource;

@Configuration
public class SchedulerConfig {

    /*@Autowired
    private DataSource dataSource;

    @Value("${spring.quartz.properties}")
    private Map<String, Object> config;

    @Bean(name="SchedulerFactory")
    public SchedulerFactoryBean schedulerFactoryBean() throws IOException {
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
//        factory.setQuartzProperties(quartzProperties());
        factory.setDataSource(dataSource);
        return factory;
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.quartz.properties")
    public Properties quartzProperties(Map<String, Object> map) throws IOException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
//        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
        //在quartz.properties中的属性被读取并注入后再初始化对象
//        propertiesFactoryBean..afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }

    *//*
     * quartz初始化监听器
     *//*
    @Bean
    public QuartzInitializerListener executorListener() {
        return new QuartzInitializerListener();
    }

    */
    /*
     * 通过SchedulerFactoryBean获取Scheduler的实例
     */
    /*@Bean(name="Scheduler")
    public Scheduler scheduler(SchedulerFactoryBean schedulerFactoryBean) throws IOException {
        return schedulerFactoryBean.getScheduler();
    }*/


}
