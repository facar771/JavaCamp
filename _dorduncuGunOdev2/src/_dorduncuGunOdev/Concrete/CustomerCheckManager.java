package _dorduncuGunOdev.Concrete;

import _dorduncuGunOdev.Entities.Customer;
import _dorduncuGunOdev.interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("Mernis onaylandý :");
		return true;
	}
}
