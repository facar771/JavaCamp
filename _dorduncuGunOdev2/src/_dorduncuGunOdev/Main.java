package _dorduncuGunOdev;

import _dorduncuGunOdev.Abstract.BaseCustomerManager;
import _dorduncuGunOdev.Concrete.CustomerCheckManager;
import _dorduncuGunOdev.Concrete.robotUygulumasý;
import _dorduncuGunOdev.services.StarbucksCustomerManager;
import _dorduncuGunOdev.Entities.Customer;
import _dorduncuGunOdev.interfaces.CustomerCheckService;
import _dorduncuGunOdev.services.NeroCustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		
		customer1.setId(1);
		customer1.setFirstName("Ferhat");
		customer1.setLastName("Acar");
		customer1.setIdentityNumber("8989879879");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new robotUygulumasý());		
		customerManager.add(customer1);
		
	}
}
