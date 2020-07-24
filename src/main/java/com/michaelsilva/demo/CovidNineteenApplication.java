package com.michaelsilva.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidNineteenApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidNineteenApplication.class, args);
    }

}
