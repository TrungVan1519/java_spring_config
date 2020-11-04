package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BluePrint carBluePrint = context.getBean("bluePrint", BluePrint.class);
		carBluePrint.setType("car");
		Vehicle car = context.getBean("vehicle", Vehicle.class);
		System.out.println(car.getType());
		
		BluePrint bikeBluePrint = context.getBean("bluePrint", BluePrint.class);
		bikeBluePrint.setType("bike");
		Vehicle bike = context.getBean("vehicle", Vehicle.class);
		System.out.println(bike.getType());
		
		context.close();
	}
}
