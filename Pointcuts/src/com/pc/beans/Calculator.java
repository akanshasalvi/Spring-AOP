package com.pc.beans;

public class Calculator {
	
	public int add(int a, int b)
	{
		int sum = 0;
		sum = a + b;
		System.out.println("In add()");
		return sum;
	}
		
	public int multiply(int a, int b)
	{
		System.out.println("In multiply()");
		return a*b;
	}
}
