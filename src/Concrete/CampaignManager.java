package Concrete;


import Abstract.CampaignService;
import Entities.Game;

public class CampaignManager implements CampaignService  {

	@Override
	public void update(Game game) {
		System.out.println("Campaign uptaded with new one.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("for " + game.getGameName()+ " campaign deleted.");
		
	}

	@Override
	public void add(Game game) {
		System.out.println("for " + game.getGameName()+ " campaign eklendi.");
		
	}



	
}
