package com.bl.generics;

public class Max_String {
	public static void main(String[] args)
	{
		String a = "Apple";
		String b = "Peach";
		String c = "Banana";
		findstring(a, b, c);
		
	}
	public static String findstring(String a,String b,String c) 
	{
		if(a.compareTo(b)>0&&a.compareTo(c)>0) 
		{
			return a;
		}
		 else if(b.compareTo(a)>0&&b.compareTo(c)>0) 
		{
			return b;
		}
		 else 
		 {
			 return c;
		 }
	}
}
