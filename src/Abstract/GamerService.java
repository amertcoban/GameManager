package Abstract;

import Entities.Gamer;

public interface GamerService {
	
	public void register (Gamer gamer);
	

	public void dataUpdate (Gamer gamer);
	
	
	public void accountDelete (Gamer gamer);

}
