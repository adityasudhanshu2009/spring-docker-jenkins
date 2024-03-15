package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutenSpringDockerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutenSpringDockerJenkinsApplication.class, args);
	}
	
	@GetMapping("/sayhello")
	public String sayhello() {
		return "welcome all";
	}
	

}
