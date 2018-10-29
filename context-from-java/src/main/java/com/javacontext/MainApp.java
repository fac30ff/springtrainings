package com.javacontext;

import com.javacontext.configuration.AllConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    /** ApplicationContext javaCtx = new JavaConfigApplicationContext();
     * old realisation of java config of context, now only annotationconfig for java config or
     * annotation config based application context
     */
     ApplicationContext javaCtx = new AnnotationConfigApplicationContext(AllConfig.class);
  }
}
