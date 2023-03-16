package org.fi.finalapp.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.fi.finalapp.dto.CategoryDTO;
import org.fi.finalapp.entity.Category;
import org.fi.finalapp.repository.CategoryRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServicesImpl implements CategoryServices {

	@Autowired
	CategoryRepository repositoryCategory;
	
	@Override
	public Integer addNew(CategoryDTO objCategory) {
		Category entityCategory = new Category();
		// Introspection
		BeanUtils.copyProperties(objCategory, entityCategory);

		return repositoryCategory.save(entityCategory).getCategoryId();
	}

	@Override
	public List<CategoryDTO> getCategory() {
		Iterator<Category> iter = repositoryCategory.findAll().iterator();
		ArrayList<CategoryDTO> list = new ArrayList<>();
		while (iter.hasNext()) {
			Category entityCategory = iter.next();
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entityCategory, dto);
			list.add(dto);
		}
		return list;
	}

	@Override
	public CategoryDTO getCategory1(int categoryId) {
		Optional<Category> optCategory = repositoryCategory.findById(categoryId);
		if (optCategory.isPresent()) {
			Category entityCategory = optCategory.get();
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entityCategory, dto);
			return dto;
		}
		return null;
	}

	@Override
	public Integer deleteCategroy(int categoryId) {
		Optional<Category> optCategory = repositoryCategory.findById(categoryId);
		if (optCategory.isPresent()) {
			int entityCategory = optCategory.get().getCategoryId();
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entityCategory, dto.getCategoryId());
			repositoryCategory.deleteById(dto.getCategoryId());
			return dto.getCategoryId();
		}
		return -1;
		
		
	}

}
