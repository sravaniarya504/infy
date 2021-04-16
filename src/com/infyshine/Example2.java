package com.infyshine;

public class Example2 {

	public static void main(String[] args) {
	
	try
	{
		System.out.println("In try1");
		}
	catch(Exception e)
	{
		System.out.println("In catch1");
	}
	System.out.println("In try/catch1");
	try
	{
		System.out.println("In try2");
	}
	catch(Exception e)
	{
		System.out.println("In catch2");
	}
	System.out.println("In try/catch2");
}
}
