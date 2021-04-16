package com.infyshine;

public class InnerTryDemo1 {

	public static void main(String[] args) {
		System.out.println("10/0");
	
		try {
			System.out.println("In outer try");
			try
			{
				System.out.println("In inner try");
			}
			catch(ArithmeticException e) 
			{
					System.out.println("In inner catch");
			
			}
			System.out.println("After inner try/catch");
		}
		catch(ArithmeticException nas) 
			{
					System.out.println("In outer catch");
			}
		System.out.println("After outer try/catch");
	
	}

}
