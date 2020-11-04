package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p1 = context.getBean("person", Person.class);
		Person p2 = context.getBean("person", Person.class);
		System.out.println("p1 == p2? " + (p1 == p2));
		
		Animal a1 = context.getBean("animal", Animal.class);
		Animal a2 = context.getBean("animal", Animal.class);
		System.out.println("a1 == a2? " + (a1 == a2));
		context.close();
	}
}
