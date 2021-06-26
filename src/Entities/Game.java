package Entities;

import Abstract.Entity;

public class Game implements Entity {

	private String gameName;
	private int gameRelease;
	private int gameVersion;
	private int gamePrice;
	private int gameDiscount;
	
	public Game () {
		System.out.println("for game everything ok ! ");
	}
	
	public Game (String gameName,int gameRelease,int gameVersion,int gamePrice,int gameDiscount) {
		this.gameName=gameName;
		this.gameRelease=gameRelease;
		this.gameVersion=gameVersion;
		this.gameDiscount=gameDiscount;
		this.gamePrice=gamePrice;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGameRelease() {
		return gameRelease;
	}

	public void setGameRelease(int gameRelease) {
		this.gameRelease = gameRelease;
	}

	public int getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(int gameVersion) {
		this.gameVersion = gameVersion;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

	public int getGameDiscount() {
		return gamePrice-((gamePrice*gameDiscount)/100);
	}
}
