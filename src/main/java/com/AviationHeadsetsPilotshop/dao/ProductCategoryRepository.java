package com.AviationHeadsetsPilotshop.dao;

import com.AviationHeadsetsPilotshop.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category") //changing default settings for name of JSON entry and for ref path
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
