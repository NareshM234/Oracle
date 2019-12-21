package com.datageeks;

import java.util.Set;

public class ProductDAO {
	
	Set<Product> set = DataUtil.getProducts();
	
	public Product getById(Integer productId) throws DetailsNotFoundExcetion
	{
		Product  p = new Product();
		p.setProductId(productId);
		
		if(set.contains(p))
		{
			return set.stream().filter(pro -> pro.getProductId() == productId).findFirst().get();
	    }
		throw new DetailsNotFoundExcetion(" Product ID Does not exist");
	}
	
	public void delete(Integer productId) throws DetailsNotFoundExcetion
	{
		Product  p = new Product();
		p.setProductId(productId);
		
		if(set.contains(p))
		{
			set.remove(p);
	    }
		throw new DetailsNotFoundExcetion(" Product ID Does not exist");
	}

}
