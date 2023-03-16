package org.fi.finalapp.services;


import java.util.List;

import org.fi.finalapp.dto.CategoryDTO;



public interface CategoryServices {

	public Integer addNew(CategoryDTO objCategory) ;
	public List<CategoryDTO> getCategory();
	public CategoryDTO getCategory1(int categoryId);
	public Integer deleteCategroy(int categoryId);
	
}
