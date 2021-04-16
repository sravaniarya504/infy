package com.infyshine;

public class Student {
	int id;
	String name;
	int age;
	Student(int i,String n){
		id=i;
		name=n;
	}
	Student(int i,String n,int a)
	{
	id=i;
	name=n;
}
    void display() {
    	System.out.println(id+" "+name+" "+age);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s1=new Student(111,"santhu");
	Student s2=new Student(222,"arya",25);
	s1.display();
	s2.display();

	}

}
