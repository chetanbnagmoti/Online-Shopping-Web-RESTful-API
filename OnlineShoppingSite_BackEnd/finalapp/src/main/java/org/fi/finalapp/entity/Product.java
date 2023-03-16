package org.fi.finalapp.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="products_0013")
public class Product {

	@EmbeddedId
	ProductId id;
	
	@Column(name="productsname")
	String productsName;
	
	@Column(name="productsdescriptio")
	String productsDescriptio;
	
	@Column(name="productsprice")
	float productsPrice;
	
	@Column(name="productsimageurl")
	String productsImageUrl;

	public ProductId getId() {
		return id;
	}

	public void setId(ProductId id) {
		this.id = id;
	}

	public String getProductsName() {
		return productsName;
	}

	public void setProductsName(String productsName) {
		this.productsName = productsName;
	}

	

	public String getProductsDescriptio() {
		return productsDescriptio;
	}

	public void setProductsDescriptio(String productsDescriptio) {
		this.productsDescriptio = productsDescriptio;
	}

	public float getProductsPrice() {
		return productsPrice;
	}

	public void setProductsPrice(float productsPrice) {
		this.productsPrice = productsPrice;
	}

	public String getProductsImageUrl() {
		return productsImageUrl;
	}

	public void setProductsImageUrl(String productsImageUrl) {
		this.productsImageUrl = productsImageUrl;
	}
	
	
}
