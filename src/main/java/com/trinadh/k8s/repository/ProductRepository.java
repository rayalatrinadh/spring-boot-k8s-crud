package com.trinadh.k8s.repository;

import com.trinadh.k8s.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
