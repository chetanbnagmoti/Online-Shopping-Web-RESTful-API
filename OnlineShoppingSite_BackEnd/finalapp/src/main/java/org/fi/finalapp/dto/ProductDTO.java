package org.fi.finalapp.dto;

public class ProductDTO {

	ProductIdDTO id;
	String productsName;
	String productsDescriptio;
	String productsImageUrl;
	float productsPrice;
	public ProductIdDTO getId() {
		return id;
	}
	public void setId(ProductIdDTO id) {
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
	public String getProductsImageUrl() {
		return productsImageUrl;
	}
	public void setProductsImageUrl(String productsImageUrl) {
		this.productsImageUrl = productsImageUrl;
	}
	public float getProductsPrice() {
		return productsPrice;
	}
	public void setProductsPrice(float productsPrice) {
		this.productsPrice = productsPrice;
	}
	
	
	
}
