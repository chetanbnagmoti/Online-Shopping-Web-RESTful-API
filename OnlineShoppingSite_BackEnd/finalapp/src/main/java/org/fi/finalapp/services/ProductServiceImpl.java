package org.fi.finalapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.fi.finalapp.dto.ProductDTO;
import org.fi.finalapp.dto.ProductIdDTO;
import org.fi.finalapp.entity.Product;
import org.fi.finalapp.entity.ProductId;
import org.fi.finalapp.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	MailService mailService;

	@Autowired
	ProductRepository repositoryProduct;

	@Override
	public ProductDTO getProductById(ProductIdDTO pid) {
		ProductId epid = new ProductId();
		BeanUtils.copyProperties(pid, epid);

		Optional<Product> optEntity = repositoryProduct.findById(epid);
		if (optEntity.isPresent()) {

			Product entity = optEntity.get();
			ProductDTO dto = new ProductDTO();
			ProductIdDTO dtoId = new ProductIdDTO();
			BeanUtils.copyProperties(entity.getId(), dtoId);
			BeanUtils.copyProperties(entity, dto);
//			dto.setProductName(entity.getProductsName());
//			dto.setProductDescription(entity.getProductsDescriptio());
			dto.setId(dtoId);
			return dto;
		}
		return null;
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> dataList = repositoryProduct.findAll();
		ArrayList<ProductDTO> list = new ArrayList<>();

		for (Product entity : dataList) {
			ProductDTO dto = new ProductDTO();
			ProductIdDTO dtoId = new ProductIdDTO();
			BeanUtils.copyProperties(entity.getId(), dtoId);
			BeanUtils.copyProperties(entity, dto);
			dto.setId(dtoId);
			list.add(dto);
		}

		return list;
	}

	@Override
	public boolean addNewProduct(ProductDTO objProduct) {
		ProductId pid = new ProductId();
		Product entity = new Product();
//		pid.setCategoryId(objProduct.getId().getCategoryId());
//		Integer prodId = repositoryProduct.getMaxProductId(objProduct.getId().getCategoryId());
//		pid.setProductsId(++prodId);
		BeanUtils.copyProperties(objProduct.getId(), pid);
		BeanUtils.copyProperties(objProduct, entity);
		entity.setId(pid);
		repositoryProduct.save(entity);
		String contents = "A New Product has been added to  the Catalog\n";
		contents += "Product Name : " + objProduct.getProductsName();
		contents += "\nProduct Descr : " + objProduct.getProductsDescriptio();
		contents += "\nProduct Price : " + objProduct.getProductsPrice();
		contents += "\nProduct Image : " + objProduct.getProductsImageUrl();
		contents += "\n____________________________________";

		mailService.sendMail("cbn9860@gmail.com", "New Product Added", contents);

		return true;
	}

}
