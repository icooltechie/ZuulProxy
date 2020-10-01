package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// This is a spring boot application Hence @SpringBootApplication annotation is required
@SpringBootApplication
@EnableZuulProxy
public class ZuulProxyApplication {

	public static void main(String[] args) {
		System.out.println("Starting Application");
		SpringApplication.run(ZuulProxyApplication.class, args);
	}

}
