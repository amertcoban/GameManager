	
	import Entities.Game;
	import Entities.Gamer;
	import Entities.Customer;
	import Concrete.CampaignManager;
	import Concrete.GamerManager;
	import Concrete.GameSaleManager;
	import Concrete.NewYearsCampaign;
	import Adapters.MernisVerification;
	
	
	public class Main {
	
	public static void main(String[] args) {
		
		Gamer gamer = new Gamer (15,"Mert");
		Game game = new Game ("F1",2018,3,350,10);
		Customer customer = new Customer(921,12312312,"Mert","Coban",1996);
		
		MernisVerification mernisVerification = new MernisVerification ();
		mernisVerification.verification(customer);
		
		System.out.println("----------------------------");
		
		GamerManager gamerManager = new GamerManager ();
		gamerManager.register(gamer);
		gamerManager.dataUpdate(gamer);
		gamerManager.accountDelete(gamer);
		
		System.out.println("---------------------------");
		
		GameSaleManager gameSaleManager = new GameSaleManager ();
		gameSaleManager.sale(game, gamer);
		
		System.out.println("----------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.delete(game);
		
		System.out.println("----------------------------");
		
		NewYearsCampaign newYearsCampaign = new NewYearsCampaign();
		newYearsCampaign.add(game);
				
		
		
		

	}

}
