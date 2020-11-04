package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BluePrint carBluePrint = context.getBean("carBluePrint", BluePrint.class);
		System.out.println(carBluePrint);

		BluePrint bikeBluePrint = context.getBean("bikeBluePrint", BluePrint.class);
		System.out.println(bikeBluePrint);

		BluePrint blahBluePrint = context.getBean("BlahBlah", BluePrint.class);
		System.out.println(blahBluePrint);
		
		context.close();
	}
}
