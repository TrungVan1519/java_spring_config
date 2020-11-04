package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p = context.getBean("person", Person.class);
		System.out.println(p);
		
		context.close();
	}
}
