package ca.owenpeterson.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	

	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice run. Get method called.");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice executed.");
		
	}
	
	//runs before a get method call with any return type.
	// ".." matches to zero or more arguments.
	@Pointcut("execution(* get*())")
	public void allGetters() {}

}
