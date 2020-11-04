package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Human american = context.getBean("getAmerican", American.class);
		System.out.println(american.speak());
		
		Human spanish = context.getBean("spanish", Spanish.class);
		System.out.println(spanish.speak());
		
		context.close();
	}
}
