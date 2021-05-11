package _besinciGunOdev.nLayered.dataAccess.concretes.nHibernate;

import java.util.List;

import _besinciGunOdev.nLayered.dataAccess.abstracts.UserDao;
import _besinciGunOdev.nLayered.entities.concretes.User;

public class NHibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " NHibernate eklendi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " NHibernate Silindi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " NHibernate Güncellendi");
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}