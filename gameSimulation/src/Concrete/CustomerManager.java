package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	
	CustomerService customerService;

	@Override
	public void add(Customer customer) {
		
		System.out.println("m��teri eklendi :" +customer.getFirsName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("m��teri silindi :" +customer.getFirsName());		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("m��teri g�ncelledni :"+customer.getFirsName());		
	}

	@Override
	public void getAll(Customer[] customer) {
		
		for(Customer customers:customer) {
			
			System.out.println("m��teriler "  +customers.getFirsName());
		}
	}

}
