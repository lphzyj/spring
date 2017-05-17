package com.lph.app.core.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource(value = "classpath:message.properties")
//导入properties文件信息
public class PropertiesConfig {
    
    //这个bean不要忘记配置  如果不配置 上面取得的值为 @Value中的表达式 显然是不符合情况的
    @Bean
    public PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
	return new PropertySourcesPlaceholderConfigurer();
    }
}
