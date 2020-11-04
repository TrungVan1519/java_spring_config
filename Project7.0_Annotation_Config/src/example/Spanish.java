package example;

import org.springframework.stereotype.Component;

@Component("mySpanish")
public class Spanish implements Human {

	@Override
	public String speak() {
		return "Hola";
	}

}
