package dorduncuGunOdev3.Business;

import dorduncuGunOdev3.Entities.Gamer;

public class GamerManager implements GamerService{

	VerificationService service;
	
	public GamerManager(VerificationService service) {
		this.service = service;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(service.verify(gamer)) {
			System.out.println(gamer.getFirstName() + " eklendi.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		
	}
	
}
