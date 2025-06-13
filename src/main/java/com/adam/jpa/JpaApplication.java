package com.adam.jpa;

import com.adam.jpa.models.Author;
import com.adam.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(AuthorRepository repository){
        return args -> {
            var author = Author.builder()
                    .firstName("Adam")
                    .lastName("Ngazzou")
                    .age(20)
                    .email("adem.ngazzou@horizon-university.tn")
                    .build();
            repository.save(author);
        };
    }
}
