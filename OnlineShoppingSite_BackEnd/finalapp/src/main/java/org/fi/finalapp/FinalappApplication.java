package org.fi.finalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"org.fi.finalapp.contollers","org.fi.finalapp.services"})
@EntityScan(basePackages = {"org.fi.finalapp.entity"})
@EnableJpaRepositories(basePackages = {"org.fi.finalapp.repository"})
public class FinalappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalappApplication.class, args);
	}

}
