package com.DataJpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DataJpa.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
