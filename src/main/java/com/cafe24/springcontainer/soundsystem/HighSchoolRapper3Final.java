package com.cafe24.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component("highSchoolRapper3Final")//네임 지정해야 할 때도 있음
//@Named("highSchoolRapper3Final") //이건 그냥 참고로 알아두기
public class HighSchoolRapper3Final implements CompactDisc {

	private String title = "지구멸망";
	private String artist = "양승호";
	
	@Override
	public void play() {
		System.out.println("Playing "+title+" by " + artist);
	}
	
}
