package com.xmlcontext;

import com.xmlcontext.model.Department;
import com.xmlcontext.model.Employee;
import com.xmlcontext.model.EmployeeManager;
import com.xmlcontext.model.Operations;
import com.xmlcontext.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {

    //context from xml file
    ApplicationContext xmlCtx = new ClassPathXmlApplicationContext("bean.xml");
    Employee employee = xmlCtx.getBean(Employee.class);
    Person person = xmlCtx.getBean(Person.class);
    Department department = xmlCtx.getBean(Department.class);
    Operations operations = xmlCtx.getBean(Operations.class);
    EmployeeManager empManager = xmlCtx.getBean(EmployeeManager.class);
    Employee emp = empManager.create();

    System.out.println(emp);
    System.out.println(employee);
    System.out.println(person);
    System.out.println(department);
    System.out.println(operations);

    //context from xml file anyware in filesystem
    ApplicationContext xmlFileCtx = new FileSystemXmlApplicationContext(xmlCtx);
  }
}
