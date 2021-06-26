package Adapters;

import Abstract.CustomerService;
import Entities.Customer;
public class MernisVerification implements CustomerService {
	
	public void verification (Customer customer) {
		System.out.println(customer.getFirstName()+" E devlet üzerinden doðrulama baþarýyla yapýldý.");
	}

}
