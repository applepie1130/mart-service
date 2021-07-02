package com.mart.api;

import com.mart.common.domain.entity.EmartEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MartApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MartApiApplication.class, args);
		EmartEntity emartEntity = EmartEntity.builder()
				.martName("test")
				.build();
		System.out.println(emartEntity);
		System.out.println("TEST");
	}
}
