package Concrete;

import Abstract.SaleService;
import Entities.Game;
import Entities.Gamer;

public class GameSaleManager implements SaleService {

	@Override
	public void sale(Game game , Gamer gamer) {
		System.out.println("Welcome to our game world");
		System.out.println(game.getGameName() + " Ba�ar�yla sat�n al�nd�.");
		System.out.println(gamer.getGamerName()+ " Al�m�n i�in te�ekk�r ederiz.");
		
	}
	
	
	

	
	

}
