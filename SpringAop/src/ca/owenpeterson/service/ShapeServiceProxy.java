package ca.owenpeterson.service;

import ca.owenpeterson.aspect.LoggingAspect;
import ca.owenpeterson.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	
	@Override
	public Circle getCircle() {
		LoggingAspect loggingAspect = new LoggingAspect();
		loggingAspect.loggingAdvice();
		return super.getCircle();
	}

}
