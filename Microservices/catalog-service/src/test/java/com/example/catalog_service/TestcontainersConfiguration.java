package com.example.catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestcontainersConfiguration {

  public static void main(String[] args) {
    SpringApplication.from(CatalogServiceApplication::main).with(ContainerConfig.class).run(args);
  }
}
