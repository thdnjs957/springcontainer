package com.cafe24.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cafe24.springcontainer.user.User;

import config.user.UserConfig01;

public class JavaConfigTest01 {

	public static void main(String[] args) {
		testUser01();
		testUser02();
	}

	public static void testUser01() {
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(UserConfig01.class);//클래스 이름을 준다 , 컴파일 오류를 사전에 잡을 수 있다는 장점이 있다
		
		User user = appCtx.getBean(User.class);
		
		System.out.println(user);

		((ConfigurableApplicationContext)appCtx).close();
		
	}
	
	public static void testUser02() {
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext("config.user");//config 객체가 뭔지 모른다 @Configuration으로 해결
		
		User user = appCtx.getBean(User.class);
		
		System.out.println(user);

		((ConfigurableApplicationContext)appCtx).close();
		
	}
	
	
}
