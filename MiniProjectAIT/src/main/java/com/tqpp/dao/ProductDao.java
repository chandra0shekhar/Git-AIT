package com.tqpp.dao;

import java.util.List;

import com.tqpp.model.Product;

public interface ProductDao {

	boolean insertProduct(Product p);

	boolean deleteProductById(int pid);

	boolean updateProduct(Product p);

	List<Product> getAllProducts();

	Product getProductById(int id);
}
