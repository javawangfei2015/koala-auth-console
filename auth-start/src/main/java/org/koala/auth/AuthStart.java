package org.koala.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AuthStart {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(AuthStart.class);
        application.run(args);

    }

}
