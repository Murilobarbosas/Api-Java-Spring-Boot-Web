package com.framework.fwAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages="com.framework.fwAPI.model")
@ComponentScan(basePackages = {"com.framework.*"})
public class FwApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FwApiApplication.class, args);
	}

}
