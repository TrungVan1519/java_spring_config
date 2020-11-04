package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:info.properties")
public class BluePrint {
	private String type;

	@Autowired
	@Value("${forBike}")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}
}
