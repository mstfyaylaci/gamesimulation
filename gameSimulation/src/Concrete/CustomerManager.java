package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	
	CustomerService customerService;

	@Override
	public void add(Customer customer) {
		
		System.out.println("müþteri eklendi :" +customer.getFirsName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("müþteri silindi :" +customer.getFirsName());		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("müþteri güncelledni :"+customer.getFirsName());		
	}

	@Override
	public void getAll(Customer[] customer) {
		
		for(Customer customers:customer) {
			
			System.out.println("müþteriler "  +customers.getFirsName());
		}
	}

}
