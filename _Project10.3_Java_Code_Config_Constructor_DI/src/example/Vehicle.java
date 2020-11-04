package example;

public class Vehicle {
	private BluePrint bluePrint;

	public Vehicle(BluePrint bluePrint) {
		super();
		this.bluePrint = bluePrint;
	}
	
	public BluePrint getType() {
		return bluePrint;
	}
}
