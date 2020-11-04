package example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	BluePrint bluePrintObj() {
		return new BluePrint();
	}
	
	@Bean
	Vehicle carObj() {
		return new Vehicle(bluePrintObj());
	}
	
	@Bean
	Vehicle bikeObj() {
		return new Vehicle(bluePrintObj());
	}
}
