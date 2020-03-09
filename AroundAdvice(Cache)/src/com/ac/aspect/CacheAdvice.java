package com.ac.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.ac.beans.Cache;

public class CacheAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Map<String, Integer> dataMap = null;
		Cache cache = null;
		String key = null;
		
		String methodName = methodInvocation.getMethod().getName();
		Object[] args = methodInvocation.getArguments();
		
		System.out.println("Entered into cache");
		key = methodName + "(";
		for(int i = 0;i<args.length;i++)
		{
			if(i == 0)
			{
				key += args[i];
				continue;
			}
			key +=","+args[i];
		}
		key +=")";
		
		cache = Cache.getInstance();
		
		//check if the key is available in the cache or not
		//if available then return key
		if(cache.containKey(key)==true)
		{
			if(dataMap.containsKey(key))
			{
				return dataMap.containsKey(key);
			}
		}
		
		//if not available call the original method and store the return value in cache
		Object ret = methodInvocation.proceed();
		if(dataMap == null)
		{
			dataMap = new HashMap<>();
			dataMap.put(key, (Integer) ret);
		}
		
		
		
		
		return ret;
	}

}
