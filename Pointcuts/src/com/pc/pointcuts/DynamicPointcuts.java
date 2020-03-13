package com.pc.pointcuts;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.pc.beans.Calculator;

public class DynamicPointcuts extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> classtype, Object... args) {
		if(classtype.isAssignableFrom(Calculator.class) && method.getName().equals("add"))
		{			
			int a = (Integer) args[0];
			int b = (Integer) args[1];
			if(a >= 50 && b >= 50)
			{
				return true;
			}
		}
		return false;
	}

}
