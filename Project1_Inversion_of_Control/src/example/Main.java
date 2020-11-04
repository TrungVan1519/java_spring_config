package example;

public class Main {
	public static void main(String[] args) {
		// Co che IoC: Thuc chat la co che Cha = new Con()
		Human american = new American();
		System.out.println(american.speak());
		
		Human spanish = new Spanish();
		System.out.println(spanish.speak());
	}
}
