package Concrete;

import Entities.Gamer;

import Abstract.GamerService;

public class GamerManager implements GamerService {

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getGamerName()+" ba�ar�yla kay�t oldu");
	}

	@Override
	public void dataUpdate(Gamer gamer) {
		System.out.println(gamer.getGamerName()+ " isimli kullan�c�n bilgileri ba�ar�yla g�ncellendi.");
		
	}

	@Override
	public void accountDelete(Gamer gamer) {
		System.out.println(gamer.getLevel()+" Level hesab�n�z� silmek istedi�inize emin misiniz ?");
		System.out.println( "Say�n " + gamer.getGamerName()+ " hesab�n�z ba�ar�yla silindi" );
		
		
	}

}
