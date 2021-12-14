package com.bl.generics;

public class Max_float {
	public static void main(String[] args)
	{
		double x = 45.25;
		double y = 51.65;
		double z = 97.00;
		Max_float max_float = new Max_float();
		System.out.println(max_float.findmaxnumber(x, y, z));
	}
	public double findmaxnumber(double x, double y,double z) 
	{
		if(x>y && x>z) 
		{
			return x;
		}
		if(y>x && y>z) 
		{
			return y;
		}
		if (z>x && z>y) 
		{
			return z;
		}
		return 0;
	}
}
