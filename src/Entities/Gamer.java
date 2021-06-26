package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
	
	private int level;
	private String gamerName;
	
	
	public Gamer () {
		System.out.println("for gamer everything ok !"); 
	}

	public Gamer (int level,String gamerName) {
		
		this.level=level;
		this.gamerName=gamerName;
		
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

}
