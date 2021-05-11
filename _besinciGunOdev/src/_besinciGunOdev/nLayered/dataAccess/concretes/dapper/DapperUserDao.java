package _besinciGunOdev.nLayered.dataAccess.concretes.dapper;

import java.util.List;

import _besinciGunOdev.nLayered.dataAccess.abstracts.UserDao;
import _besinciGunOdev.nLayered.entities.concretes.User;

public class DapperUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("dapperle EKLENDÝ");
	}

	@Override
	public void delete(User user) {
		System.out.println("dapperle silindi");
	}

	@Override
	public void update(User user) {
		System.out.println("dapperle güncellendi");
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
