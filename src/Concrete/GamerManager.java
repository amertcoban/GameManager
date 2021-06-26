package Concrete;

import Entities.Gamer;

import Abstract.GamerService;

public class GamerManager implements GamerService {

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getGamerName()+" baþarýyla kayýt oldu");
	}

	@Override
	public void dataUpdate(Gamer gamer) {
		System.out.println(gamer.getGamerName()+ " isimli kullanýcýn bilgileri baþarýyla güncellendi.");
		
	}

	@Override
	public void accountDelete(Gamer gamer) {
		System.out.println(gamer.getLevel()+" Level hesabýnýzý silmek istediðinize emin misiniz ?");
		System.out.println( "Sayýn " + gamer.getGamerName()+ " hesabýnýz baþarýyla silindi" );
		
		
	}

}
