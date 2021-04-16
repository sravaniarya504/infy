package com.infyshine;

public class Employee {
private String name;
private int salary;
private int bonus;
private String department;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getSalary() {
    return salary;
}

public void setSalary(int salary) {
    this.salary = salary;
}

public int getBonus() {
    return bonus;
}

public void setBonus(int bonus) {
    this.bonus = bonus;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}


public static void main(String args[]) {
Employee e = new Employee();
e.setName("Keithan");
e.setSalary(10000);
e.setBonus(3000);
e.setDepartment("Engineering");

System.out.println("name:"+e.name);
System.out.println("salary:"+e.salary);
System.out.println("bonus:"+e.bonus);
System.out.println("department:"+e.department);

}
}