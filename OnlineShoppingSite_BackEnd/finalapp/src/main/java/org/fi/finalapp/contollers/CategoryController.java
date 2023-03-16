package org.fi.finalapp.contollers;

import java.util.List;

import org.fi.finalapp.dto.CategoryDTO;
import org.fi.finalapp.services.CategoryServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {

	@Autowired
	CategoryServices categoryServices;

	@PostMapping("/newCategory")
	public Integer addNew(@RequestBody CategoryDTO objCategory) {
		return categoryServices.addNew(objCategory);
	}

	@GetMapping("/getAll")
	public List<CategoryDTO> getCategory() {
		return categoryServices.getCategory();

	}

	@GetMapping("/get/{cid}")
	public CategoryDTO getCategory1(@PathVariable("cid") int categoryId) {
		return categoryServices.getCategory1(categoryId);

	}

	@GetMapping("/deleteCategory")
	public Integer deleteCategroy(@RequestParam("categoryId") int categoryId) {
		return categoryServices.deleteCategroy(categoryId);

	}

}
