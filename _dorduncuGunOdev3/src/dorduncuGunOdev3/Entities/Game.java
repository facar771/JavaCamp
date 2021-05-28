package dorduncuGunOdev3.Entities;

public class Game {
	private int GameId;
	private String GameName;
	private int Price;
	private int Stock;
	
	public Game() {
		
	}
	
	public Game(int gameId, String gameName, int price, int stock) {
		super();
		GameId = gameId;
		GameName = gameName;
		Price = price;
		Stock = stock;
	}
	
	
	public int getGameId() {
		return GameId;
	}
	public void setGameId(int gameId) {
		GameId = gameId;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
}
