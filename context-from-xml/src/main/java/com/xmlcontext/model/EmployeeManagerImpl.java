package com.xmlcontext.model;

public class EmployeeManagerImpl implements EmployeeManager {
  public Employee create() {
    Employee e = new Employee();
    e.setId(1);
    e.setName("a");
    return e;
  }
}
