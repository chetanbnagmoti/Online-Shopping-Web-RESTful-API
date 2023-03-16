package org.fi.finalapp.services;

import java.util.List;

import org.fi.finalapp.dto.ProductDTO;
import org.fi.finalapp.dto.ProductIdDTO;

public interface ProductService {

	public ProductDTO getProductById(ProductIdDTO pid); 
	
	public List<ProductDTO> getAllProducts();
	
	public boolean addNewProduct(ProductDTO objProduct);
}
