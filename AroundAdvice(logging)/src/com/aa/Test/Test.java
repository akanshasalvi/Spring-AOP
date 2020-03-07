package com.aa.Test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.aspect.LoggingAdvice;
import com.aa.beans.Calculator;

public class Test {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new LoggingAdvice());
		
		Calculator proxy = (Calculator)pf.getProxy();
		int sum = proxy.add(10, 20);
		System.out.println("Sum is:-"+sum);

	}

}
