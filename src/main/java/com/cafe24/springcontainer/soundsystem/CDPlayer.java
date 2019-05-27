package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	// wiring01 밑에 @Autowired 주석 풀면 이거 필요
	@Autowired //이거 한줄 대신에 wiring02 생성자로 주입 가능  
	private CompactDisc cd;
	
//	public CDPlayer() {} 이게 있으면 먼저 기본 생성자 쓰고 없으면 CDPlayer 쓴다
	
	// wiring02
//	@Autowired//생성자를 사용하는 wiring
//	private CDPlayer(CompactDisc cd) {
//		this.cd = cd;
//	}
	
//	//wiring03
//	@Autowired
//	public void setCompactDisc(CompactDisc cd) { //setter , xml 설정으로도 가능
//		this.cd = cd;
//	}
//	
//	
//	//wiring04
//	@Autowired
//	public void insertCompactDisc(CompactDisc cd) {
//		this.cd = cd;
//	}
	

	public void play() {
		cd.play();
	}
	
}
