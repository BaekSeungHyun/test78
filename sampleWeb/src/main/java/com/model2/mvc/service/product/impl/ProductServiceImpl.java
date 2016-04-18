package com.model2.mvc.service.product.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductDao;
import com.model2.mvc.service.product.ProductService;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
	public ProductServiceImpl() {
		System.out.println(this.getClass());
	}

	public void setProductDAO(ProductDao productDAO) {
		this.productDao = productDAO;
	}
	
	public void addProduct(Product productVO) throws Exception {
		productDao.addProduct(productVO);
	}

	public Product getProduct(int prodNo) throws Exception {
		return productDao.getProduct(prodNo);
	}

	public void updateProduct(Product product) throws Exception {
		productDao.updateProduct(product);
	}

	public Map<String,Object> getProductList(Search search) throws Exception {
		List<Product> list = productDao.getProductList(search);
		int totalCount = productDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}


}