package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

public void getScheme(Employee emp) {

if (emp.getSalary() > 5000 && emp.getSalary() < 20000)
emp.setInsuranceScheme("Scheme C");

else if (emp.getSalary() >= 20000 && emp.getSalary() < 40000)
emp.setInsuranceScheme("Scheme B");

else if (emp.getSalary() >= 40000)
emp.setInsuranceScheme("Scheme A");

else
emp.setInsuranceScheme("No Scheme");
}
}
