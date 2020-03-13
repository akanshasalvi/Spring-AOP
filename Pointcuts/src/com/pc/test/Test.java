package com.pc.test;

import org.springframework.aop.framework.ProxyFactory;

import com.pc.aspect.LoggingAdvice;
import com.pc.beans.Calculator;

public class Test {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new LoggingAdvice());
		
		Calculator proxy = (Calculator)pf.getProxy();
		int sum = proxy.add(10, 20);
		System.out.println("Addition is:"+sum);
		
		int multiply = proxy.add(10, 20);
		System.out.println("Multiplication is:"+multiply);
	}

}
