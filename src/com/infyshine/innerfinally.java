package com.infyshine;

public class innerfinally {

	public static void main(String[] args) {
		
		System.out.println( m1());
	}
	static int m1() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In Inner try");
				System.out.println(10/0);
		    }
		    catch(NullPointerException e)
		    {
			System.out.println("In Inner catch");
	    	}
		    finally 
		    {
			System.out.println("In Inner finally");
		    return 20;
		    }
			//System.out.println("After Inner try/catch/finally");
	    }
		catch(NullPointerException e)
		{
			System.out.println("In outer catch");
		}
		finally 
		{
			System.out.println("In outer finally");
		}
			System.out.println("After outer try/catch/finally");
	        return 30;
		}
	}


