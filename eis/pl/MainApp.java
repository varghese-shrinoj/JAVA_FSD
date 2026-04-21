package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class MainApp {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter ID:");
int id = sc.nextInt();
sc.nextLine();

System.out.println("Enter Name:");
String name = sc.nextLine();

System.out.println("Enter Salary:");
double salary = sc.nextDouble();
sc.nextLine();

System.out.println("Enter Designation:");
String des = sc.nextLine();

Employee emp = new Employee(id, name, salary, des);

EmployeeServiceImpl service = new EmployeeServiceImpl();
service.getScheme(emp);

System.out.println("\nEmployee Details:");
System.out.println(emp);

sc.close();
}
}