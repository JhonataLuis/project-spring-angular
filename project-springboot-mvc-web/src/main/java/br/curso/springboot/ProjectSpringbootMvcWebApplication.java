package br.curso.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackages = {"br.curso.springboot.model"})
@RestController
public class ProjectSpringbootMvcWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringbootMvcWebApplication.class, args);
	}

}
