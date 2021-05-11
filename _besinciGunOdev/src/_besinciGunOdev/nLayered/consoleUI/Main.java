package _besinciGunOdev.nLayered.consoleUI;

import _besinciGunOdev.nLayered.business.abstracts.AuthService;
import _besinciGunOdev.nLayered.business.abstracts.EmailService;
import _besinciGunOdev.nLayered.business.adapters.googleAuthManagerAdapter;
import _besinciGunOdev.nLayered.business.concretes.AuthManager;
import _besinciGunOdev.nLayered.business.concretes.UserManager;
import _besinciGunOdev.nLayered.business.concretes.email.GmailManager;
import _besinciGunOdev.nLayered.business.concretes.email.HotmailManager;
import _besinciGunOdev.nLayered.dataAccess.concretes.inMemory;
import _besinciGunOdev.nLayered.dataAccess.concretes.dapper.DapperUserDao;
import _besinciGunOdev.nLayered.dataAccess.concretes.nHibernate.NHibernateUserDao;
import _besinciGunOdev.nLayered.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user = new User(1,"Ferhat","AÇAR","*****@gmail.com","SIFRE123");
		
		inMemory memory=new inMemory();
		
		UserManager userManager = new UserManager(memory , new GmailManager());
		userManager.add(user);
		
		AuthService auth=new AuthManager(memory,new GmailManager());
		auth.logIn(user.getEmail(), user.getPassaword());
		
		AuthService auth2=new googleAuthManagerAdapter();
		auth2.logIn("sdf", "sfsdf");
		
		
	}
}

