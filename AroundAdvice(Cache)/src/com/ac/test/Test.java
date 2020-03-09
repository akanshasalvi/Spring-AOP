package com.ac.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ac.aspect.CacheAdvice;
import com.ac.beans.Calculator;

public class Test {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new CacheAdvice());
		
		Calculator proxy = (Calculator)pf.getProxy();
		int sum = proxy.add(10, 20);
		sum = proxy.add(10, 20);
	}

}
