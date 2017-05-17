package com.lph.app.core.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("email")
public class Email {

    @Value("admin@yiibai.com")
    public String emailAddress;

    // ...
}