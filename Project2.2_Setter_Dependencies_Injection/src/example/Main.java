package example;

public class Main {
	public static void main(String[] args) {
		// Co che Constructor DI la co che 1 obj duoc tao ra
		//	bi phu thuoc vao 1 obj khac thong qua setter
		Vehicle car = new Vehicle();
		car.setBluePrint(new BluePrint("This is a car"));
		System.out.println(car.getType());
		
		Vehicle bike = new Vehicle();
		bike.setBluePrint(new BluePrint("This is a bike"));
		System.out.println(bike.getType());
	}
}
