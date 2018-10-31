package com.annotation.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration("mainconfig")
public class MainConfig {

  private static final Logger logger = LoggerFactory.getLogger(MainConfig.class);


  @Bean
  public CommandLineRunner runCLR() throws Exception {
    return args -> logger.info("");
  }

  @Bean
  public ApplicationRunner runAR() throws Exception {
    return args -> {
      String[] arg = new String[0];
      String strArgs = String.join("|", arg);
      logger.info("Application started with arguments:" + strArgs);
    };
  }

  /**
   * recursive bean registration of class
   */
  @Component
  public static class MyBDRPP implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
      beanDefinitionRegistry.registerBeanDefinition("barService", BeanDefinitionBuilder.genericBeanDefinition(BarService.class).getBeanDefinition());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
  }

  @Component
  class FooService {
    private final BarService barService;

    FooService(BarService barService) {
      this.barService = barService;
    }
  }

  class BarService {

  }
}
