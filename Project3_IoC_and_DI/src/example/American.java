package example;

public class American implements Human {
	private Vehicle vehicle;
	
	public American(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	@Override
	public String speak() {
		return "Hello" + vehicle.getType();
	}
}
