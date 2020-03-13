package com.pc.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodinvocation) throws Throwable {
		String methodName = methodinvocation.getMethod().getName();
		Object[] args = methodinvocation.getArguments();
		
		System.out.println("Entering in method "+methodName+" with arguments ("+args[0]+","+args[1]+")");
		
		Object ret = methodinvocation.proceed();
		
		System.out.println("Exiting from method "+methodName+ "with return value "+ret);
		return ret;
	}

}
