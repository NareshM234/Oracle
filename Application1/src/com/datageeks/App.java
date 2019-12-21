package com.datageeks;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println(" *** DATA ****"+DataUtil.getProducts());
		
		ProductDAO dao = new ProductDAO();
		
		try
		{
			System.out.println("Product Info Found ::"+dao.getById(11231));
			
		}catch(DetailsNotFoundExcetion exp)
		{
			System.out.println(exp.getMessage());
		}
	}

}
