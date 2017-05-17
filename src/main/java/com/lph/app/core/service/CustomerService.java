package com.lph.app.core.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
/**
 * 作用域注释写法
 * 
 * @author Administrator
 *
 */
public class CustomerService {
    String message;

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

//    @PostConstruct
    // 代替init-method
    public void initIt() throws Exception {
	System.out.println(CustomerService.class.getName() + "我正在被初始化，我在bean初始化时调用");
    }

//    @PreDestroy
    /*
     * 代替destroy-method 需要注册CommonAnnotationBeanPostProcessor方能使用
     * 或者使用<context:annotation-config />
     */
    public void cleanUp() throws Exception {
	System.out.println(CustomerService.class.getName() + "我正在被销毁，我在bean销毁时调用");
    }

    public CustomerService() {
	super();
	// TODO Auto-generated constructor stub
	this.message = "lph";
    }

    public CustomerService(String message) {
	super();
	this.message = message;
    }

    @Override
    public String toString() {
	return "CustomerService [message=" + message + "]";
    }

}
