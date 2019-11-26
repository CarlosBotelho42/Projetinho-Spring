package com.projetinho.projetinho.config;

import com.projetinho.projetinho.entities.User;
import com.projetinho.projetinho.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { //vai popular o banco de dados

    @Autowired //spring resolve a dependencia só com isso
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(1, "Carlos", "Carlos@gmail.com", "992588796","123456");
        User u2 = new User(2,"Mari","Mari@gmail.com","222550000","54321");

        userRepository.saveAll(Arrays.asList(u1,u2));

    }
}
