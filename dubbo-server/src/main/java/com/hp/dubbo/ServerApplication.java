package com.hp.dubbo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {


	public static void main(String[] args) {
		
		// start embedded zookeeper server
		new EmbeddedZooKeeper(2181, false).start();

		
		SpringApplication.run(ServerApplication.class, args);
	}
	
}
