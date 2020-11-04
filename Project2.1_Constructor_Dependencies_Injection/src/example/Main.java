package example;

public class Main {
	public static void main(String[] args) {
		// Co che Constructor DI la co che 1 obj duoc tao ra thong qua
		//	Constructor bi phu thuoc vao 1 obj khac 
		Vehicle car = new Vehicle(new BluePrint("This is a car"));
		System.out.println(car.getType());
		
		Vehicle bike = new Vehicle(new BluePrint("This is a bike"));
		System.out.println(bike.getType());
	}
}
