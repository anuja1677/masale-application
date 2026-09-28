package com.example.masale_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.masale_app.entities.Userdata;
import com.example.masale_app.repository.UserReopsitory;

@SpringBootApplication
public class MasaleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasaleAppApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserReopsitory repo) {   // ✅ fixed spelling
        return args -> {
            if (repo.findByUsername("admin") == null) {

                Userdata admin = new Userdata();
                admin.setUsername("admin");
                admin.setPassword("admin123");
                admin.setRole("ADMIN");

                repo.save(admin);
            }
        };
    }
}