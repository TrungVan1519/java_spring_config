package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// use custom annotation
		Human american = context.getBean("myAmerican", American.class);
		System.out.println(american.speak());
		
		Human spanish = context.getBean("mySpanish", Spanish.class);
		System.out.println(spanish.speak());
		
		// use default annotation
		Human defaultPerson = context.getBean("personWithDefaultAnnotation", PersonWithDefaultAnnotation.class);
		System.out.println(defaultPerson.speak());
		
		context.close();
	}
}
