package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		BluePrint carBluePrint = context.getBean("bluePrintObj", BluePrint.class);
		carBluePrint.setType("This is a car");
		System.out.println(carBluePrint);
		Vehicle car = context.getBean("vehicleObj", Vehicle.class);
		car.setBluePrint(carBluePrint);
		System.out.println(car.getType());
		
		BluePrint bikeBluePrint = context.getBean("bluePrintObj", BluePrint.class);
		bikeBluePrint.setType("This is a bike");
		System.out.println(bikeBluePrint);
		Vehicle bike = context.getBean("vehicleObj", Vehicle.class);
		bike.setBluePrint(bikeBluePrint);
		System.out.println(bike.getType());
		
		context.close();
	}
}
