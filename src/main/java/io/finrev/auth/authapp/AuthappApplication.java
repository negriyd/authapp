package io.finrev.auth.authapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class AuthappApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthappApplication.class, args);
    }

}
