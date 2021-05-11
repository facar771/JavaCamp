package _besinciGunOdev.nLayered.business.concretes.email;

import _besinciGunOdev.nLayered.business.abstracts.EmailService;

public class GmailManager implements EmailService{

	@Override
	public void send() {
		System.out.println("Gmail gönderildi");
	}

}
