package _besinciGunOdev.nLayered.business.concretes.email;

import _besinciGunOdev.nLayered.business.abstracts.EmailService;

public class HotmailManager implements EmailService{

	@Override
	public void send() {
		System.out.println("Hotmail gönderildi");
	}

}
