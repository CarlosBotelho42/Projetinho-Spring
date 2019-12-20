package com.projetinho.projetinho.repositories;

import com.projetinho.projetinho.entities.Order;
import com.projetinho.projetinho.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
