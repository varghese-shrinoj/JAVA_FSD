package com.cg.eis.bean;

public class Employee {

private int id;
private String name;
private double salary;
private String designation;
private String insuranceScheme;

public Employee(int id, String name, double salary, String designation) {
this.id = id;
this.name = name;
this.salary = salary;
this.designation = designation;
}

public double getSalary() {
return salary;
}

public String getDesignation() {
return designation;
}

public void setInsuranceScheme(String scheme) {
this.insuranceScheme = scheme;
}

public String toString() {
return id + " " + name + " " + salary + " " + designation + " " + insuranceScheme;
}
}