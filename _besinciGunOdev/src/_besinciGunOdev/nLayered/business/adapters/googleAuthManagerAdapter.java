package _besinciGunOdev.nLayered.business.adapters;

import _besinciGunOdev.nLayered.business.abstracts.AuthService;
import _besinciGunOdev.nLayered.entities.concretes.User;
import _besinciGunOdev.nLayered.googleAuth.googleAuthManager;

public class googleAuthManagerAdapter implements AuthService {
	
	googleAuthManager googleAuth=new googleAuthManager();
	
	@Override
	public void logIn(String email, String passaword) {
		googleAuth.login(email,passaword);
		
	}

	@Override
	public void register(User user) {
		googleAuth.register(user);
	}
	
}
