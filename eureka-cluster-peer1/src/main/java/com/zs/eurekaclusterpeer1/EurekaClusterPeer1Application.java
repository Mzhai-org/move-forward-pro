package com.zs.eurekaclusterpeer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterPeer1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClusterPeer1Application.class, args);
	}

}
