package com.yaswanth.oops.One;

public class Play {
	private Team team1;
	private Team team2;
	private Empire empire;
	public Play(Team team1, Team team2, Empire empire) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.empire = empire;
		start();
	}
	
	public void start() {
		System.out.println("Match Started");
		System.out.println(team1.getTeam()+" X "+team2.getTeam());
		System.out.println(empire.getName());
		System.out.println("Match Started ...");
	}
}
