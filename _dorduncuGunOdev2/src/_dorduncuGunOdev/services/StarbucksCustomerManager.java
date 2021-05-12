package _dorduncuGunOdev.services;

import _dorduncuGunOdev.Abstract.BaseCustomerManager;
import _dorduncuGunOdev.Entities.Customer;
import _dorduncuGunOdev.interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customercheckService;
	
	public StarbucksCustomerManager() {
		
	}

	public StarbucksCustomerManager(CustomerCheckService customercheckService) {
		super();
		this.customercheckService = customercheckService;
	}

	@Override
	public void add(Customer customer) {
		if(customercheckService.CheckIfRealPerson(customer)){
			super.add(customer);
		}
		else {
			System.out.println("gecersiz");
		}
	}
}
