package com.AviationHeadsetsPilotshop.dao;

import com.AviationHeadsetsPilotshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
