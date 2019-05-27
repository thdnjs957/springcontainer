package com.cafe24.springcontainer.videosystem;

public class IronMan implements DigitalVideoDisc {

	private String title = "아이언맨";
	private String studio = "마블";
	
	@Override
	public void play() {
		System.out.println("Playing Movie "+studio+"'s " + title);
	}

}
