package com.example.tomato;

public class Task {
	private String tName;
	private String tNumber;
	private String tTomato;
	private String tRest;

	
	public Task(String tName,String tNumber,String tTomato,String tRest){
		this.tName = tName;
		this.tNumber = tNumber;
		this.tTomato = tTomato;
		this.tRest = tRest;

	}

	public String gettName(){
		return tName;
	}

	public String gettNumber(){
		return tNumber;
	}
	
	public String gettTomato(){
		return tTomato;
	}
	
	public String gettRest(){
		return tRest;
	}
	

	public void settName(String tName){
		this.tName = tName;
	}

	public void settNumber(String tNumber){
		this.tNumber = tNumber;
	}
	
	public void settTomato(String tTomato){
		this.tTomato = tTomato;
	}
	
	public void settRest(String tRest){
		this.tRest = tRest;
	}
	

}

