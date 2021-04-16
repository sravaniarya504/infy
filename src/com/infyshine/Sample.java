package com.infyshine;

class Sample extends Example
{
	void m1()	 
	{
		System.out.println("Sample m1");
	}
	void m2()	 
	{
		super.m2();
		System.out.println("Sample m2");
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.m1();
		s.m2();
		s.m3();
	}

	}
