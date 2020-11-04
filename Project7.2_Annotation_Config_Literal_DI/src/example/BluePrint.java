package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BluePrint {
	private String type;

	@Autowired
	@Value("This is a car")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}
}
