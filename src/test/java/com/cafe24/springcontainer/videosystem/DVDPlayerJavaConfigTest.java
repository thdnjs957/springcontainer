package com.cafe24.springcontainer.videosystem;
/*
 * 명시적 Configuration 에서도  Java Config
 * @Bean 정도만?
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.DVDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DVDPlayerConfig.class) 
public class DVDPlayerJavaConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private DigitalVideoDisc dvd; //interface
	
	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer player;	
	
	
	@Test
	public void testDVDNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testPlayerNull() { //주입한거 test
		
		assertNotNull(player);
		
	}
	
	@Test
	public void testPlay() {
		
		player.play();
		assertEquals("Playing Movie 마블's 어벤져스01\r\n",systemOutRule.getLog());
		
	}
	
	
	
}
