package example;

import org.springframework.stereotype.Component;

@Component
public class PersonWithDefaultAnnotation implements Human {

	@Override
	public String speak() {
		return "Default annotation";
	}
}
