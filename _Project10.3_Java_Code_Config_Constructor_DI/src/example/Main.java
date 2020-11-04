package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		BluePrint carBluePrint = context.getBean("bluePrintObj", BluePrint.class);
		carBluePrint.setType("car");
		System.out.println("blue:" + carBluePrint);
		
		Vehicle car = context.getBean("carObj", Vehicle.class);
		System.out.println(car.getType());
		
		BluePrint bikeBluePrint = context.getBean("bluePrintObj", BluePrint.class);
		bikeBluePrint.setType("bike");
		
		Vehicle bike = context.getBean("bikeObj", Vehicle.class);
		System.out.println(bike.getType());
		
		context.close();
	}
}
