package com.infyshine;
class A {
void m1(float f) {
	System.out.println("A float-arg");
}
}
class B extends A{
	void m1(int a) {
		System.out.println("B int-arg");
		}
}