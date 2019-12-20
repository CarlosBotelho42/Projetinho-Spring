package com.projetinho.projetinho.config;

import com.projetinho.projetinho.entities.Category;
import com.projetinho.projetinho.entities.Order;
import com.projetinho.projetinho.entities.User;
import com.projetinho.projetinho.entities.enums.OrderStatus;
import com.projetinho.projetinho.repositories.CategoryRepository;
import com.projetinho.projetinho.repositories.OrderRepository;
import com.projetinho.projetinho.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { //vai popular o banco de dados

    @Autowired //spring resolve a dependencia só com isso
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User u1 = new User(1, "Carlos", "Carlos@gmail.com", "992588796","123456");
        User u2 = new User(2,"Mari","Mari@gmail.com","222550000","54321");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-08-21T03:42:10Z"), u2, OrderStatus.SHIPPED);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.DELIVERED);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));


    }
}
