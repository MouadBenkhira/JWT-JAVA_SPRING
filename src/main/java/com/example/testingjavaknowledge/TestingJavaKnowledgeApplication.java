package com.example.testingjavaknowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.data.jpa.repository.config.EnableJpaAuditing
public class TestingJavaKnowledgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingJavaKnowledgeApplication.class, args);
    }

}
