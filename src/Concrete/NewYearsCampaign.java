package Concrete;

import Abstract.CampaignService;
import Entities.Game;

public class NewYearsCampaign implements CampaignService {

	
	
	@Override
	public void update(Game game) {
		System.out.println("Yeni yýl kampanyasý baþarýyla güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Yeni yýl kampanyasý baþarýyla silindi.");
	}

	@Override
	public void add(Game game) {
		
		System.out.println("Yeni yýl kampanyasý baþarýyla eklendi.");
		System.out.println("Kampanya sonucu yeni ücret : "+game.getGameDiscount());
	}

}
