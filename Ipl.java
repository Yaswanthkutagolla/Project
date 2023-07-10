package com.yaswanth.oops.One;

public class Ipl extends International implements Matches{
	
	private Team team1;
	
	private Team team2;
	
	private Empire empire;
	
	public Ipl() {
		team1=new Team();
		team2=new Team();
		empire=new Empire("Nitin Menon");
	}
	
	@Override
	public void teams() {
		// TODO Auto-generated method stub
		team1.setTeam("Mumbai Indians");
		team2.setTeam("Deccan Chargers");
	}

	@Override
	public void start(int i) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		teams();
		new Play(team1,team2,empire);
		
	}

}
