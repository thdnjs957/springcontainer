package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.user.User;

@Configuration //config 설정이 되어있는 자바 클래스다..! 톰캣이 보통 패키지로 접근하니깐 달아주자
public class UserConfig02 {

	@Bean
	public User user() {
		return new User();
	}
	
}
