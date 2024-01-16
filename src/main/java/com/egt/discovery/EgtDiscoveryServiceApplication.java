package com.egt.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EgtDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EgtDiscoveryServiceApplication.class, args);
	}

}
