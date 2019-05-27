package com.cafe24.springcontainer.videosystem;

public class Avengers implements DigitalVideoDisc {

	private String title = "어벤져스01";
	private String studio = "마블";
	
	@Override
	public void play() {
		System.out.println("Playing Movie "+studio+"'s " + title);
	}

}
