package com.eleiatech.stockmanagement.productservice.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    Product getByProductIdAndDeltedFalse(Long productId);

    List<Product> getAllByDeletedFalse();
}
