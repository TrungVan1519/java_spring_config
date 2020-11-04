package example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Person {
	@PostConstruct
	private void onCreate() {
		System.out.println("Person obj is created");
	}
	
	@PreDestroy
	private void onDestroy() {
		System.out.println("Person obj is destroyed");
	}
}
