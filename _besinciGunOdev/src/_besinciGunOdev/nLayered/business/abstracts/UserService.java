package _besinciGunOdev.nLayered.business.abstracts;

import java.util.List;

import _besinciGunOdev.nLayered.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
}
