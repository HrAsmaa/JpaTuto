package com.tuto.jpa;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class JpaTutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaTutoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository videoRepository) {
		return args -> {
			for (int i=0; i<10; i++){
				var author = Author.builder()
						.firstName("name"+i)
						.email("dsds"+i+"@asmaa.com")
						.age(28)
						.build();
			videoRepository.save(author);
			}
			 videoRepository.updateAuthorAge(20, 1);
		};
	}

}
