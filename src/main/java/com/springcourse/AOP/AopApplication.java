package com.springcourse.AOP;

import com.springcourse.AOP.Bussines.BusinessService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AopApplication implements CommandLineRunner {
	private Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	private BusinessService businessService1;

	public AopApplication(BusinessService businessService) {
		this.businessService1 = businessService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Max: {}", businessService1.calculateMax());
	}
}
