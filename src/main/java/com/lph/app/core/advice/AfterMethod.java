package com.lph.app.core.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterMethod implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
	System.out.println(AfterMethod.class.getName()+":在方法"+arg1.getName()+"后执行~~~");
    }

}
