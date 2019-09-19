package com.codecool.jpaintro;

import com.codecool.jpaintro.entity.Student;
import com.codecool.jpaintro.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class JpaIntroApplication {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaIntroApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(){
        return args -> {
            Student john = Student.builder()
                    .email("john@codecool.com")
                    .name("John")
                    .birthDate(LocalDate.of(1990, 8, 13))
                    .build();
            studentRepository.save(john);
        };
    }

}
