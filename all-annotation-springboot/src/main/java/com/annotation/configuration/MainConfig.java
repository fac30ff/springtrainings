package com.annotation.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.stream.Collectors;

@Configuration("mainconfig")
public class MainConfig {

  private static final Logger logger = LoggerFactory.getLogger(MainConfig.class);

  @Autowired
  final private RestTemplate restTemplate;


  @Bean
  public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
    return args -> {
      logger.info(restTemplate);
    }
  }

  @Bean
  public ApplicationRunner run(String... args) throws Exception{
    String strArgs = Arrays.stream(args).collect(Collectors.joining("|"));
    logger.info("Application started with arguments:" + strArgs);
  }
}
