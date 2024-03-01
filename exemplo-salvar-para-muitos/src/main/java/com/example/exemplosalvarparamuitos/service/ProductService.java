package com.example.exemplosalvarparamuitos.service;

import com.example.exemplosalvarparamuitos.dto.CategoryDTO;
import com.example.exemplosalvarparamuitos.dto.ProductDTO;
import com.example.exemplosalvarparamuitos.entities.Category;
import com.example.exemplosalvarparamuitos.entities.Product;
import com.example.exemplosalvarparamuitos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public ProductDTO insert(ProductDTO dto){

        Product entity = new Product();
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());

        for (CategoryDTO catDTO : dto.getCategories()){
            Category cat = new Category();
            cat.setId(catDTO.getId());
            entity.getCategories().add(cat);
        }

        entity = productRepository.save(entity);

        return new ProductDTO(entity);
    }
}
