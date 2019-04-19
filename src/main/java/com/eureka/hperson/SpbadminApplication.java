package com.eureka.hperson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;


@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableEurekaClient
public class SpbadminApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(SpbadminApplication.class, args);
	}
}