package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student kevin = new Student(
                    "Kevin",
                    "kevin@gmail.com",
                    LocalDate.of(2000, APRIL, 5),
                    21
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2003, NOVEMBER, 29),
                    29
            );

            studentRepository.saveAll(
                    List.of(kevin, alex)
            );
        };
    }
}
