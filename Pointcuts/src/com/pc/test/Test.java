package com.pc.test;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.pc.aspect.LoggingAdvice;
import com.pc.beans.Calculator;
import com.pc.pointcuts.LoggingPoint;

public class Test {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvisor(new DefaultPointcutAdvisor(new LoggingPoint(), new LoggingAdvice()));
		
		Calculator proxy = (Calculator)pf.getProxy();
		
		int sum = proxy.add(10, 20);
		System.out.println("Addition is:"+sum);
		
		int multiply = proxy.multiply(10, 20);
		System.out.println("Multiplication is:"+multiply);
	}

}
