package com.mart.api;

import com.mart.api.web.repository.mongo.BaseMongoRepositoryPackageLocation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = BasePackageLocation.class)
//@EnableMongoRepositories(basePackageClasses = BaseMongoRepositoryPackageLocation.class)
public class MartApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MartApiApplication.class, args);
	}
}
