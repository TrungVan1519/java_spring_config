package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p1 = context.getBean("singleton_person", Person.class);
		Person p2 = context.getBean("singleton_person", Person.class);
		System.out.println("p1 == p2? " + (p1 == p2));

		Person p3 = context.getBean("prototype_person", Person.class);
		Person p4 = context.getBean("prototype_person", Person.class);
		System.out.println("p3 == p4? " + (p3 == p4));
		
		context.close();
	}
}
