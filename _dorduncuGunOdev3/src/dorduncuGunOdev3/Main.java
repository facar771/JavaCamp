package dorduncuGunOdev3;


import dorduncuGunOdev3.Business.EDevletVerificationManager;
import dorduncuGunOdev3.Business.GamerManager;
import dorduncuGunOdev3.Business.GamerService;
import dorduncuGunOdev3.Business.SalesManager;
import dorduncuGunOdev3.Business.SalesService;
import dorduncuGunOdev3.Entities.Game;
import dorduncuGunOdev3.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Ferhat");
		gamer.setLastName("AÇAR");
		gamer.setIdentificationNumber("12321321");
		
		Game game = new Game();
		game.setGameId(1);
		game.setGameName("GTA-V");
		game.setPrice(50);
		game.setStock(15);
		
		GamerService gamerService = new GamerManager(new EDevletVerificationManager());
		gamerService.add(gamer);
		
		SalesService salesService = new SalesManager();
		salesService.buy(game, gamer);
	}

}
