package com.lph.app.core.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundMethod implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

	System.out.println("Method name : " + methodInvocation.getMethod().getName());
	System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));

	// same with MethodBeforeAdvice
	System.out.println("AroundMethod : 在方法之前执行!");

	try {
	    // proceed to original method call
	    Object result = methodInvocation.proceed();

	    // same with AfterReturningAdvice
	    System.out.println("AroundMethod : 在方法之后执行!");

	    return result;

	} catch (IllegalArgumentException e) {
	    // same with ThrowsAdvice
	    System.out.println("AroundMethod : 在抛出异常时执行!");
	    throw e;
	}
    }

}
