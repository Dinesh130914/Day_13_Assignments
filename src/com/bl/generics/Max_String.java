package com.bl.generics;

public class Max_String {
	public static void main(String[] args)
	{
		String a = "Apple";
		String b = "Peach";
		String c = "Banana";
		String obj=findstring(a, b, c);
		System.out.println("Maximum String is :"+obj);
		
	}
	public static String findstring(String a,String b,String c) 
	{
		String max = a;
		if(b.compareTo(max)>0) 
		{
			max= b;
		}
		if(c.compareTo(max)>0) 
		{
			max = c;
		}
		return max;
	}
}
