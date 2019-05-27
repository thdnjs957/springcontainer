package com.cafe24.springcontainer.videosystem;

//수동이니깐 autowired랑 component를 못 붙임


public class DVDPlayer {
	private DigitalVideoDisc dvd;//주입을 받아야 함
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
		
	}
		
	public void setDigitalVideoDisc(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}


	public void play() {//잘 주입 받았는지 확인
		dvd.play();
	}
	
}
