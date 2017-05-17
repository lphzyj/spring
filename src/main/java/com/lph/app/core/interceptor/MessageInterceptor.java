package com.lph.app.core.interceptor;


import javax.annotation.Resource;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
import com.lph.app.core.entity.Message;

//@Service
//public class MessageInterceptor implements ApplicationListener<ContextRefreshedEvent>{
//    @Resource
//    Message message;
//    
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent arg0) {
//	System.out.println(message);
//    }
//}
