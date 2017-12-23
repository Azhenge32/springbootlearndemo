package com.azhne.springbootlearndemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootlearndemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootlearndemoApplication.class, args);
		SpringApplication app = new SpringApplication(SpringbootlearndemoApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
