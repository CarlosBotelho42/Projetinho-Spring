package com.projetinho.projetinho.repositories;

import com.projetinho.projetinho.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
