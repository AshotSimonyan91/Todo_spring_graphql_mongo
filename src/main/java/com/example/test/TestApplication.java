package com.example.test;

import com.example.test.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@RequiredArgsConstructor
public class TestApplication {


    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
