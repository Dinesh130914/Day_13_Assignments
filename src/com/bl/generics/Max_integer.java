package com.bl.generics;

public class Max_integer {
	public static void main(String[] args)
	{
		int x = 45;
		int y = 51;
		int z = 97;
		Max_integer max_integer = new Max_integer();
		System.out.println(max_integer.findmaxnumber(x, y, z));
	}
	public int findmaxnumber(int x, int y,int z) 
	{
		if(x>y&&x>z) 
		{
			return x;
		}
		if(y>x&&y>z) 
		{
			return y;
		}
		if (z>x&&z>y) 
		{
			return z;
		}
		return 0;
	}
}
