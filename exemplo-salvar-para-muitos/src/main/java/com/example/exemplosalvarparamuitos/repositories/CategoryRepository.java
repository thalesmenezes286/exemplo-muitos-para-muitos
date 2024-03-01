package com.example.exemplosalvarparamuitos.repositories;



import com.example.exemplosalvarparamuitos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
