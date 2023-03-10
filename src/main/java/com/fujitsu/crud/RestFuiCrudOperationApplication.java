package com.fujitsu.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
@EnableJpaRepositories
@EntityScan(basePackageClasses=RestFuiCrudOperationApplication.class)
public class RestFuiCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFuiCrudOperationApplication.class, args);
	}

}
