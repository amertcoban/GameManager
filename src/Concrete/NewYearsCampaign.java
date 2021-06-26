package Concrete;

import Abstract.CampaignService;
import Entities.Game;

public class NewYearsCampaign implements CampaignService {

	
	
	@Override
	public void update(Game game) {
		System.out.println("Yeni y�l kampanyas� ba�ar�yla g�ncellendi");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Yeni y�l kampanyas� ba�ar�yla silindi.");
	}

	@Override
	public void add(Game game) {
		
		System.out.println("Yeni y�l kampanyas� ba�ar�yla eklendi.");
		System.out.println("Kampanya sonucu yeni �cret : "+game.getGameDiscount());
	}

}
