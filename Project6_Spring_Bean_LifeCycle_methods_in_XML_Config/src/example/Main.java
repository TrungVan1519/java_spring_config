package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = context.getBean("singleton_person", Person.class);
		person.onDoSomething();
		
		context.close();
	}
}
