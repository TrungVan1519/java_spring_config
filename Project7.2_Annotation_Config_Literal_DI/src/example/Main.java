package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BluePrint bluePrint = context.getBean("bluePrint", BluePrint.class);
		System.out.println(bluePrint);
		
		context.close();
	}
}
