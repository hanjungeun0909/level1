package com.example.week1test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week1test1Application {

    public static void main(String[] args) {
        SpringApplication.run(Week1test1Application.class, args);
    }

}