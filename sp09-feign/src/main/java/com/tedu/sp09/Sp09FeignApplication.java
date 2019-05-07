package com.tedu.sp09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients  //feign配置
//@EnableDiscoveryClient  //注册发现
//@SpringBootApplication
@EnableCircuitBreaker //熔断器
@SpringCloudApplication
public class Sp09FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp09FeignApplication.class, args);
	}

}
