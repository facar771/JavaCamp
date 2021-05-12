package _dorduncuGunOdev.Concrete;

import _dorduncuGunOdev.Entities.Customer;
import _dorduncuGunOdev.interfaces.CustomerCheckService;

public class robotUygulumasý implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("robot doðrulamasý uygulandý ");
		return false;
	}
	
}
