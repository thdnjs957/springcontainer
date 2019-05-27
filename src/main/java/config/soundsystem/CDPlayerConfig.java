package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.soundsystem.Index;

@Configuration
@ComponentScan(basePackages="com.cafe24.springcontainer.soundsystem") //도메인이 다 있는 곳
//@ComponentScan(basePackages= {"com.cafe24.springcontainer.soundsystem,com.cafe24.springcontainer.videosystem"})

//basePackageClass에 지정한 클래스 가 속한 패키지를 scanning Base Package로 사용한다.(Marker Interface)
//@ComponentScan(basePackageClasses=Index.class) //인터페이스로 만들어서 비워둠, 강사님도 써보진 않았음 그냥 참고


public class CDPlayerConfig {
	
	//user처럼 bean을 만들 필요가 없다 scan하니깐 @Component가 붙여있으면 알아서..
	//근데 위에 component scan하고 수동으로 @Bean으로 수동 설정을 같이 쓸 수 있다
	
}
