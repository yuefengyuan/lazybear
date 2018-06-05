package com.lazy.bear;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lazy.bear.dao")
public class LazybearApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazybearApplication.class, args);
	}
}
