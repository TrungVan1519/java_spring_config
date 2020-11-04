package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BluePrint carBluePrint = context.getBean("bluePrint", BluePrint.class);
		System.out.println(carBluePrint);
		
		context.close();
	}
}
