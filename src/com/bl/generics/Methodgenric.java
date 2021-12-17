package com.bl.generics;

public class  Methodgenric{
	
	public static <T extends Comparable<T>> T maximum(T x,T y,T z) 
	{
		T max = x;
		if(y.compareTo(max)>0) 
		{
			max = y;
		}
		if(z.compareTo(max)>0) 
		{
			max = z;
		}
		
		return max;
	}	
	
	public static void main(String[] args)
	{
		
		Integer xint=12, yint = 15, zint = 16;
		Float xflt = 2.36f, yflt = 65.23f, zflt = 24.32f;
		String xstr = "You", ystr = "read", zstr = "me";
		
		
		int obj1 = maximum(xint, yint, zint);
		double obj2 = maximum(xflt, yflt,zflt);
		String obj3 = maximum(xstr, ystr, zstr);
		
		System.out.println("Maximum Integer Value is :"+obj1);
		System.out.println("Maximum Float Value is :"+obj2);
		System.out.println("Maximum String Value is :"+obj3);
		
	}
}
