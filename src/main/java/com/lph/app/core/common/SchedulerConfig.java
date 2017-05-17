package com.lph.app.core.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lph.app.core.entity.SchedulerBo;

@Configuration
public class SchedulerConfig {

    @Bean(name="scheduler")
    public SchedulerBo SchedulerBo(){
	return new SchedulerBo();
    }
}
