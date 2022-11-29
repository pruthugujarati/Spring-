package springExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springExample")

public class AppConfig {

//	@Bean(name="Hello_Annotation")
//	
//	public Hello_Annotation get() {
//		return new Hello_Annotation();
//	}
	
}
