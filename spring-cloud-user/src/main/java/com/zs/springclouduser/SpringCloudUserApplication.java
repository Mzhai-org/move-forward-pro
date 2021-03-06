package com.zs.springclouduser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.zs.springclouduser.mapper")
@SpringBootApplication
@EnableTransactionManagement
@EnableEurekaClient//该注解声明当前应用为eureka client，只能与eureka一起使用。
//@EnableDiscoveryClient 该注解对spring cloud中所有服务注册组件提供支持，zookeeper，consul等等。
public class SpringCloudUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUserApplication.class, args);
	}

}
