package com.tqpp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.tqpp.model.Product;


@Transactional
@Repository
public class ProductDaoImpl implements ProductDao
{
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public boolean insertProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductById(int pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		return sessionfactory.getCurrentSession().createQuery("from Product").list();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
