package com.infyshine;

public class Test {

	public static void main(String[] args) 
	{

try 
{
	System.out.println("In try");
}
catch(ArithmeticException ae)
{
	System.out.println("getMessage() method output");
	System.out.println(ae.getMessage());
	System.out.println("=======================\n");
	
	System.out.println("toString() method output");
	System.out.println(ae.toString());
	System.out.println("=======================\n");
	
	System.out.println("printStackTrace() method output");
	ae.printStackTrace();
	System.out.println("=======================\n");
	
	System.out.println("JVM default output");
	throw ae;
       }
	}

}
