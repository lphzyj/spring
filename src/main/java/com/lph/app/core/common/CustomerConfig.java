package com.lph.app.core.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lph.app.core.entity.CustomerBo;

@Configuration
public class CustomerConfig {

    @Bean(name = "customer")
    public CustomerBo customerBo() {

	return new CustomerBo();

    }
}
