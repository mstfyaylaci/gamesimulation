package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService{

	@Override
	public void add(Product product) {
		System.out.println("�r�n eklendi :" +product.getProductName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("�r�n silindi :" +product.getProductName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("�r�n g�ncellendi :" +product.getProductName());
		
	}

	
}
