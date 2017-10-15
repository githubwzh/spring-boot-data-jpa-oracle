package com.example.springbootdatajpaoracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
//@EnableDiscoveryClient
@Configuration
@ComponentScan(basePackages = "com.example.springbootdatajpaoracle",
		excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Tests.*"))
public class SpringBootDataJpaOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaOracleApplication.class, args);
	}
}
