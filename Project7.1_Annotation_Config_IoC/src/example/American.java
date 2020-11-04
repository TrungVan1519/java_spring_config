package example;

import org.springframework.stereotype.Component;

@Component("myAmerican")
public class American implements Human {

	@Override
	public String speak() {
		return "Hello";
	}
}
