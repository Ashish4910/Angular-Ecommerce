package com.Angular_With_Spring_Ecommerce.Angular_With_Spring_Ecommerce.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Angular_With_Spring_Ecommerce.Angular_With_Spring_Ecommerce.entity.ProductCategory;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category") // this expose the point	// like get and post																							// mapping
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
