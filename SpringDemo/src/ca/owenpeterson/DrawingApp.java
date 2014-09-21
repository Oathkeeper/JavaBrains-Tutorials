package ca.owenpeterson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		//Triangle triangle = (Triangle) context.getBean("triangle");
		Shape shape = (Shape) context.getBean("circle");
		
		//triangle.draw();
		shape.draw();
		
		context.close();
	}

}
