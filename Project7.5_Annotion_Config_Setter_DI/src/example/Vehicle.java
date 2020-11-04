package example; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	private BluePrint bluePrint;

	@Autowired
	public void setBluePrint(BluePrint bluePrint) {
		this.bluePrint = bluePrint;
	}
	
	public BluePrint getType() {
		return bluePrint;
	}
}
