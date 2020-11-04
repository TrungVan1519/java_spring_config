package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		BluePrint bluePrint = context.getBean("getBluePrintObj", BluePrint.class);
		System.out.println(bluePrint);
		
		context.close();
	}
}
