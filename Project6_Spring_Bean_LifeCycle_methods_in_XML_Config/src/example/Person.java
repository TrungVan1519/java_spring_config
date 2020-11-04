package example;

public class Person {
	public void onCreate() {
		System.out.println("Spring Bean is created");
	}
	
	public void onDestroy() {
		System.out.println("Spring Bean is destroyed");
	}
	
	public void onDoSomething() {
		System.out.println("Do something");
	}
}
