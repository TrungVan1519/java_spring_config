package example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public American getAmerican() {
		return new American();
	}
	
	@Bean 
	public Spanish spanish() {
		return new Spanish();
	}
}
