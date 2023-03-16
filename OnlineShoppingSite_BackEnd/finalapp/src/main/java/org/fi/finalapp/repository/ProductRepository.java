package org.fi.finalapp.repository;

import org.fi.finalapp.entity.Product;
import org.fi.finalapp.entity.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, ProductId> {

//	@Query(nativeQuery = true,value="select Max(productsId) from products_0013 where categoryId=:catId")
//	public Integer getMaxProductId(@Param("catId")  int categoryId);
}
 