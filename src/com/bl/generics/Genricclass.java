package com.bl.generics;

public class Genricclass<T extends Comparable<T>> {

	T x,y,z;
	
	public Genricclass(T x, T y, T z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		}
	public T maximum() {
		return Genricclass.maximum(x, y, z);
	}
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max)>0) 
		{
			max = y;
		}
		if(z.compareTo(max)>0) 
		{
			max = z;
		}
		printmax(x,y,z,max);
		return max;
	}
	private static<T> void printmax(T x, T y, T z, T max) {
		System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
		
	}
	
	public static void main(String[] args)
	{
		Integer xint=12, yint = 15, zint = 16;
		Float xflt = 2.36f, yflt = 65.23f, zflt = 24.32f;
		String xstr = "You", ystr = "read", zstr = "me";
		
		new Genricclass(xint, yint, zint).maximum();
		new Genricclass(xflt, yflt, xflt).maximum();
		new Genricclass(xstr, ystr, zstr).maximum();
		
	}
}
