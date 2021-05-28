package dorduncuGunOdev3.Business;

import dorduncuGunOdev3.Entities.Campaign;
import dorduncuGunOdev3.Entities.Game;
import dorduncuGunOdev3.Entities.Gamer;

public class SalesManager implements SalesService{
	
	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kisisi " + game.getGameName() + " oyununu satin alindi");
	}
	
	public void buy(Game game, Campaign campaign, Gamer gamer) {
		System.out.println(" Kampanyali satis yapildi");
	}

}
