package example;

public class Spanish implements Human {
	private Vehicle vehicle;
	
	public Spanish(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	@Override
	public String speak() {
		return "Hola" + vehicle.getType();
	}

}
