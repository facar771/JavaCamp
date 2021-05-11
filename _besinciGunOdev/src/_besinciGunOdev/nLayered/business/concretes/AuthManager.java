package _besinciGunOdev.nLayered.business.concretes;

import _besinciGunOdev.nLayered.business.abstracts.AuthService;
import _besinciGunOdev.nLayered.business.abstracts.EmailService;
import _besinciGunOdev.nLayered.dataAccess.abstracts.UserDao;
import _besinciGunOdev.nLayered.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserDao userDao;
	private EmailService emailService;
	
	public AuthManager(UserDao userDao, EmailService emailService) {
		this.userDao = userDao;
		this.emailService=emailService;
	}

	@Override
	public void logIn(String email, String passaword) {
		int sayac=0;
		for(var user:userDao.getAll()) {
			if (user.getEmail() == email && user.getPassaword() == passaword) {
				System.out.println("Giris yapildi");
				sayac++;
			}
		}
		if (sayac==0) {
			System.out.println("Giris yapýlamadý");
		}
		
		
	}

	@Override
	public void register(User user) {
		
		if(user.getPassaword().length() >= 6 && user.getFirstName().length() > 2 && user.getLastName().length() > 2 ) {
			
			userDao.add(user);
			emailService.send();
			
		}
	
		else {
			System.out.println("Kiþi eklenemedi");
		}
		
	}
	
}
