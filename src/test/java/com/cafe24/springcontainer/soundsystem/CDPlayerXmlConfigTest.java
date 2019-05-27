package com.cafe24.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.CDPlayerConfig;


/*
 * Auto Configuration 에서도  XML Config(Annotation Config)
 * 자동은 Component Scanning(@Component,@Named ,@Autowired, @Inject)  
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/soundsystem/CDPlayerConfig.xml"})  //CDPlayerConfig 대신에 xml로 
public class CDPlayerXmlConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CompactDisc cd; //패키지 같으니깐 import 안해도 됨
	
	@Autowired
	private CDPlayer player;
	
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void testPlayerNull() {
		assertNotNull(player); //@Component로 컨테이너 안에 잘 들어옴
	}
	
	
	@Test
	public void testPlay() {
		
		player.play();
		assertEquals("Playing 지구멸망 by 양승호\r\n",systemOutRule.getLog());
		
	}

}
