package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Vehicle car = context.getBean("car", Vehicle.class);
		System.out.println(car.getType());
		
		Vehicle bike = context.getBean("bike", Vehicle.class);
		System.out.println(bike.getType());
		
		context.close();
	}
}
