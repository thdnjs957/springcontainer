package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.DVDPlayer;
import com.cafe24.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	//유저할때 처럼
	
	//어벤져스를 만듦
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	//wiring (주입하기) 1 ,불러서 주입
	@Bean
	public DVDPlayer dvdPlayer1() {
		return new DVDPlayer(avengers());
	}
	
	//위에 두개의 역할 대신 wiring 2 이게 제일 나음
	@Bean
	public DVDPlayer dvdPlayer2(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
	
	//wiring 3번째 방법 setter를 DVDPlayer에 생성했을경우..
	@Bean(name="dvdPlayer3")
	public DVDPlayer dvdPlayer3(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer(dvd);
		player.setDigitalVideoDisc(dvd);
		return player;
	}
	
	//wiring 4
	@Bean(name="dvdPlayer4")
	public DVDPlayer dvdPlayer4(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer(dvd);
		player.setDigitalVideoDisc(dvd);
		return player;
	}
	
	
	
	
}
