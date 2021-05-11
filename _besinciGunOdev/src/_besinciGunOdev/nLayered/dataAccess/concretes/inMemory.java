package _besinciGunOdev.nLayered.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import _besinciGunOdev.nLayered.dataAccess.abstracts.UserDao;
import _besinciGunOdev.nLayered.entities.concretes.User;

public class inMemory implements UserDao{

	ArrayList<User> userList = new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
		userList.add(user);
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public List<User> getAll() {
		
		return userList;
	}
	
}
