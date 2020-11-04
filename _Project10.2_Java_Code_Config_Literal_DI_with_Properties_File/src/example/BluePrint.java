package example;

import org.springframework.beans.factory.annotation.Value;

public class BluePrint {
	@Value("${forBlah}")
	private String type;

	@Override
	public String toString() {
		return type;
	}
}
