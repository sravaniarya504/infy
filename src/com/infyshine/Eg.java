
package com.infyshine;
public class Eg {
	static{
		System.out.println("outer class is loaded");
	}
	Eg(){
		System.out.println("outer class constructor ");
	}
	static class A{
		static {
			System.out.println("inner class is loaded");
		}
		A(){
			System.out.println("inner class constructor");
		}
		static void m1() {
			System.out.println("inner class SM");
		}
		void m2() {
			System.out.println("inner class NSM");
		}
		
	   
	}
	
}
