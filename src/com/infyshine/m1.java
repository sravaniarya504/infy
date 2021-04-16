package com.infyshine;
 
public class m1{
	public static void main(String[] args) {
		 
			int a;
			try {
				a=10;
			}
			catch(ArithmeticException e) {
				a=20;
			}
			finally {
				
			System.out.println(a);
			
		}
}
}