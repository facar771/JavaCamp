package _dorduncuGunOdev.Abstract;

import _dorduncuGunOdev.Entities.Customer;
import _dorduncuGunOdev.interfaces.CustomerService;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " kaydedildi");
	}
}
