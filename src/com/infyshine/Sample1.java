package com.infyshine;

class Sample1 extends Example1{
	Sample1()
	{
		System.out.println("Sa No-arg constructor");
}
	Sample1(String str)
	{
		super(10);
		System.out.println("Sa String-arg constructor");
	}
	public static void main(String args[])
	{
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1("abc");
	}
	}

