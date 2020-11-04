package example;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class BluePrint {
	private String type;

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}
}
