package ca.owenpeterson.service;

import ca.owenpeterson.model.Circle;
import ca.owenpeterson.model.Triangle;

public class FactoryService {
	
	public Object getBean(String beanType) {
		if (beanType.equals("shapeService")) {
			return new ShapeServiceProxy();
		}
		
		if (beanType.equals("circle")) {
			return new Circle();
		}
		
		if (beanType.equals("triangle")) {
			return new Triangle();
		}
		
		return new Object();
	}

}
