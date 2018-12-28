package com.app;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan("com.*")
public class OmseBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmseBatchApplication.class, args);
	}
}
