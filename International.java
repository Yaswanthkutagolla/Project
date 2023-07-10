package com.yaswanth.oops.One;

public class International  implements Matches{
	private Team team1;
	
	private Team team2;
	
	private Empire empire;
	
	public International() {
		team1=new Team();
		team2=new Team();
		empire=new Empire("Chris Gaffaney");
	}
	
	@Override
	public void teams() {
		// TODO Auto-generated method stub
		team1.setTeam("India");
		team2.setTeam("England");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		teams();
		
		new Play(team1,team2,empire);
		
	}

	@Override
	public void start(int time) {
		// TODO Auto-generated method stub
		
	}
}
