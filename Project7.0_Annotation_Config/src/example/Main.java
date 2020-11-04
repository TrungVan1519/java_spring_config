package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.AppConfig;

public class Main {
	public static void main(String[] args) {
		annotationConfigCombineXML();
				
		annotationConfigCombineJava();
	}

	private static void annotationConfigCombineJava() {
		AnnotationConfigApplicationContext javaCodeContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		// use custom annotation
		Human american = javaCodeContext.getBean("myAmerican", American.class);
		System.out.println(american.speak());
		
		Human spanish = javaCodeContext.getBean("mySpanish", Spanish.class);
		System.out.println(spanish.speak());
		
		// use default annotation
		Human defaultPerson = javaCodeContext.getBean("personWithDefaultAnnotation", 
				PersonWithDefaultAnnotation.class);
		System.out.println(defaultPerson.speak());
		
		javaCodeContext.close();
	}

	private static void annotationConfigCombineXML() {
		ClassPathXmlApplicationContext xmlConfigContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// use custom annotation
		Human american = xmlConfigContext.getBean("myAmerican", American.class);
		System.out.println(american.speak());
		
		Human spanish = xmlConfigContext.getBean("mySpanish", Spanish.class);
		System.out.println(spanish.speak());
		
		// use default annotation
		Human defaultPerson = xmlConfigContext.getBean("personWithDefaultAnnotation", 
				PersonWithDefaultAnnotation.class);
		System.out.println(defaultPerson.speak());
		
		xmlConfigContext.close();
	}
}
