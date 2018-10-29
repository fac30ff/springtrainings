package com.annotationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.annotationcontext.configuration"})
public class MainApp {
  public static void main(String[] args) {
  ApplicationContext annoCtx = new AnnotationConfigApplicationContext();
  }
}
