package _besinciGunOdev.nLayered.business.concretes;

import java.util.List;

import _besinciGunOdev.nLayered.business.abstracts.EmailService;
import _besinciGunOdev.nLayered.business.abstracts.UserService;
import _besinciGunOdev.nLayered.dataAccess.abstracts.UserDao;
import _besinciGunOdev.nLayered.dataAccess.concretes.nHibernate.NHibernateUserDao;
import _besinciGunOdev.nLayered.entities.concretes.User;

public class UserManager implements UserService{
 
	private UserDao userDao;
	private EmailService emailService;
	
	public UserManager(UserDao userDao, EmailService emailService) {
		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public void add(User user) {
		if(user.getPassaword().length() >= 6 && user.getFirstName().length() > 2 && user.getLastName().length() > 2 ) {
			
			userDao.add(user);
			emailService.send();
		}
	
		else {
			System.out.println("Kiþi eklenemedi");
		}
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}