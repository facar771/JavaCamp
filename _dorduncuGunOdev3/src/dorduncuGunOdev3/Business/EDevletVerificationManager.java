package dorduncuGunOdev3.Business;

import dorduncuGunOdev3.Entities.Gamer;

public class EDevletVerificationManager implements VerificationService{

	@Override
	public boolean verify(Gamer gamer) {
		System.out.println("E devlet doðrulamasi saglandi");
		return true;
	}
	
}
