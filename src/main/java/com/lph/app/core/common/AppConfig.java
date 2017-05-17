package com.lph.app.core.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.lph.app.core.HelloWorld;
import com.lph.app.core.dao.impl.CsvOutputGenerator;
import com.lph.app.core.dao.impl.JsonOutputGenerator;
import com.lph.app.core.entity.OutputHelper;

@Configuration
@ComponentScan("com.lph.app.core")
//@EnableWebMvc
@Import({CustomerConfig.class,SchedulerConfig.class,PropertiesConfig.class})
//@Import导入其他配置信息
public class AppConfig {
    
    @Bean
    public HelloWorld helloWorld(){
	return new HelloWorld();
    }

}
