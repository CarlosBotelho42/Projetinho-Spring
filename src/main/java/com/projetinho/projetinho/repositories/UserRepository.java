package com.projetinho.projetinho.repositories;

import com.projetinho.projetinho.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
