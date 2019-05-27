package com.cafe24.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cafe24.springcontainer.user.User;
import com.cafe24.springcontainer.user.User1;

public class ContainerTest {

	public static void main(String[] args) {
		//testBeanFactory();
		testApplicationContext();
	}

	public static void testApplicationContext() {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/user/applicationContext2.xml");
		
		User1 user1 = appContext.getBean(User1.class); //class 이름으로 가져옴
		System.out.println(user1.getName());
		
		//오류 bean에 id나 name을 안주면 오류남 applicationContext1은 자동scan이니깐 가능
		//user1 = (User1) appContext.getBean("user1"); 
		//System.out.println(user1.getName());
		
		//name으로 가져오기
		User user = (User)appContext.getBean("user");
		System.out.println(user);
		
		//id로 가져오기
		user = (User)appContext.getBean("usr");
		System.out.println(user);
		
		//오류 : 같은 타입의 빈이 2개이상 존재하면 ! 타입으로 빈을 가져 올 수없다.
		//user = appContext.getBean(User.class);
		
		User user2 = (User)appContext.getBean("usr2");
		System.out.println(user2);
		
		User user3 = (User)appContext.getBean("usr3");
		System.out.println(user3);
		
		User user4 = (User)appContext.getBean("usr4");
		System.out.println(user4);
		
	}
	
	public static void testBeanFactory() {
		
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext.xml"));//resource가서 위치를 가져오는
		
		//컨테이너 만든거 없어지기 전에 test
		// Auto-Configuration(Scanning) 인 경우 bean의 id가 자동으로 만들어진다.
		User1 user = (User1) bf.getBean("user1"); //근데 bean설정은 다름
		
		System.out.println(user.getName());
		
		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext2.xml"));
		
		//user = (User1)bf2.getBean("user1"); //
		user = bf2.getBean(User1.class); //이건 아이디 안넣었을때 ! 
		
		System.out.println(user.getName());
		
	}
	
}
