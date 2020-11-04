package example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:info.properties")
public class AppConfig {
	
	@Bean
	public BluePrint getBluePrintObj() {
		return new BluePrint();
	}
}
