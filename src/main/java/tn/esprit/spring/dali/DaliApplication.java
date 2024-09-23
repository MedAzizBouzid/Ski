package tn.esprit.spring.dali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EntityScan(basePackages = {"tn.esprit.spring.dali.entity"})
@ComponentScan(basePackages = {"tn.esprit.spring.dali.controller","tn.esprit.spring.dali.services","tn.esprit.spring.dali.repositories","tn.esprit.spring.dali.config"})
@EnableJpaRepositories(basePackages = {"tn.esprit.spring.dali.repositories"})
public class DaliApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaliApplication.class, args);
    }

}
