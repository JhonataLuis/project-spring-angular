package br.curso.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackages = {"br.curso.springboot.model"})
@EnableJpaRepositories(basePackages = {"br.curso.springboot.repository"})
@RestController
public class ProjectSpringbootMvcWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringbootMvcWebApplication.class, args);
	}

}
