package com.lph.app.core.advice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowException implements ThrowsAdvice{

    public void afterThrowing(IllegalArgumentException e) throws Throwable{
	System.out.println(ThrowException.class.getName()+":在发生异常后执行");
    }
}
