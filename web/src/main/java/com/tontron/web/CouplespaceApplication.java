package com.tontron.web;

import com.tontron.web.config.CoupleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,
		SecurityAutoConfiguration.class})
@Import(CoupleConfig.class)
public class CouplespaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouplespaceApplication.class, args);
	}
}
