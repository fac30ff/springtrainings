package com.xmlcontext;

import com.xmlcontext.model.Department;
import com.xmlcontext.model.Employee;
import com.xmlcontext.model.Operations;
import com.xmlcontext.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext xmlCtx = new ClassPathXmlApplicationContext("bean.xml");
    Employee employee = xmlCtx.getBean(Employee.class);
    Person person = xmlCtx.getBean(Person.class);
    Department department = xmlCtx.getBean(Department.class);
    Operations operations = xmlCtx.getBean(Operations.class);

    System.out.println(employee);
    System.out.println(person);
    System.out.println(department);
    System.out.println(operations);
  }
}
