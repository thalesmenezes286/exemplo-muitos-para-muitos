package com.example.exemplosalvarparamuitos.repositories;


import com.example.exemplosalvarparamuitos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
