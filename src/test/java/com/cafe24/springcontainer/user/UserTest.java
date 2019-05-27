package com.cafe24.springcontainer.user;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

@RunWith(SpringJUnit4ClassRunner.class)//spring JUnit
@ContextConfiguration(classes = UserConfig01.class) //test 환경에서는 이렇게 class를 갖다 댄다
public class UserTest {
	
	@Autowired
	private User user;//user를 테스트 해주고 싶다
	
	@Test
	public void testUser() {
		//assertTrue(true);//true가 아니면 error가 남
		assertNotNull(user);
		
	}
	
	
}
