package br.com.fiap.postech.goodbuy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GoodBuyConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodBuyConfigApplication.class, args);
	}

}