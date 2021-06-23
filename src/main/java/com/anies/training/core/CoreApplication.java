package com.anies.training.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

	/*@Bean
	public Hibernate5Module dataTypeHibernateModule(){
		return  new Hibernate5Module();
	}*/

}

