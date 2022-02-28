package com.tqpp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqpp.dao.ProductDao;
import com.tqpp.model.Product;

@Service
public class ProductService
{
	@Autowired
	private ProductDao pdao;
	
	
	
	public boolean insertProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean deleteProductById(int pid) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<Product> getAllProducts() {
		
		return pdao.getAllProducts();
	}


	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

