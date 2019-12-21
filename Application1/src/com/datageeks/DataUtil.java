package com.datageeks;

import java.util.HashSet;
import java.util.Set;

public class DataUtil {
	
	
	public static Set<Product> getProducts()
	{
		Set<Product> set = new HashSet<Product>();
		Product p1 = new Product(111, "Lenovo", 2500f);
		Product p2 = new Product(111, "Lenovo", 2500f);
		Product p3 = new Product(222, "Apple", 55000f);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		return set;
	}

}
