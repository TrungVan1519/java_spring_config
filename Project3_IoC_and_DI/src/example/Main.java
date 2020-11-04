package example;

public class Main {
	public static void main(String[] args) {
		// Co che IoC: Thuc chat la co che Cha = new Con()
		Human american = new American(new Vehicle(new BluePrint(". This is a car")));
		System.out.println(american.speak());
		
		Human spanish = new Spanish(new Vehicle(new BluePrint(". This is a bike")));
		System.out.println(spanish.speak());
	}
}
