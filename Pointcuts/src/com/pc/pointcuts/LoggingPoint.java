package com.pc.pointcuts;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.pc.beans.Calculator;

public class LoggingPoint extends StaticMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> classtype) {
		
		if(classtype.isAssignableFrom(Calculator.class) && method.getName().equals("add"))
		{
			System.out.println("Static method");
			return true;
		}
		return false;
	}
	
}
