package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService{

	@Override
	public void add(Product product) {
		System.out.println("ürün eklendi :" +product.getProductName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("ürün silindi :" +product.getProductName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("ürün güncellendi :" +product.getProductName());
		
	}

	
}
