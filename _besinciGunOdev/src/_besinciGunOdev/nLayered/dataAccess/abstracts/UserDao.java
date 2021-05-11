package _besinciGunOdev.nLayered.dataAccess.abstracts;

import java.util.List;

import _besinciGunOdev.nLayered.entities.concretes.User;

public interface UserDao { // Data Access Object
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
}
