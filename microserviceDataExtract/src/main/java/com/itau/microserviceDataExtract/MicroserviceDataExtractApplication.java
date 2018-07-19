package com.itau.microserviceDataExtract;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MicroserviceDataExtractApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDataExtractApplication.class, args);
//		SpringApplication.run(dataExtractAz1.class, args);
	}
	
}
