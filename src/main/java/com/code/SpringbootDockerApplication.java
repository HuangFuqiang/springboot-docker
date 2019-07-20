package com.code;

import com.code.eventListener.ApplicationReadyEventListener;
import com.code.eventListener.ApplicationStartingEventListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringbootDockerApplication.class);
//		SpringApplication.run(springBootApplication, args);
		springApplication.addListeners(new ApplicationStartingEventListener());
		springApplication.addListeners(new ApplicationReadyEventListener());
		springApplication.run(args);
	}


}
