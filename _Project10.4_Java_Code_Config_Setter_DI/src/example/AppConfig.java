package example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	BluePrint bluePrintObj() {
		return new BluePrint();
	}
	
	@Bean
	@Scope("prototype")
	Vehicle vehicleObj() {
		Vehicle vehicle = new Vehicle();
		vehicle.setBluePrint(bluePrintObj());
		return vehicle;
	}
}
