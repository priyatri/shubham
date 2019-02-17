package com.capgemini.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.beans.Product;
import com.capgemini.exceptions.ProductIdInvalidException;
import com.capgemini.ui.CollectionUtil;

public class Repo implements IRepo
{
	CollectionUtil util;
	Product product;
   Map<Integer,Product >hmap= new HashMap<Integer,Product>();
	@Override
	public Product getProductDetails(int prodCode) throws ProductIdInvalidException 
	{
		product=util.getProducts().get(prodCode);
		if(product==null)
   throw new ProductIdInvalidException();
		return product;
	}

}
