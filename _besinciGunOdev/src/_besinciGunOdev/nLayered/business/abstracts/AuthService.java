package _besinciGunOdev.nLayered.business.abstracts;

import _besinciGunOdev.nLayered.entities.concretes.User;

public interface AuthService {
	void logIn(String email, String passaword);
	void register(User user);
}
