package ca.owenpeterson.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import ca.owenpeterson.model.Circle;

@Aspect
public class LoggingAspect {
	

	//combines pointcuts.
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		Circle circle = (Circle) joinPoint.getTarget();
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethods(String name, String returnString) {
		System.out.println("A method that takes String arguments has been called. The value is: " + name + " The output value is: " + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, Exception ex) {
		System.out.println("An exception has been thrown: " + ex);
	}
	
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		
		
		try {
			
			System.out.println("Before advice");
			
			returnValue = proceedingJoinPoint.proceed();
			
			System.out.println("After returning");
		} catch (Throwable e) {
			System.out.println("After throwing");
		}
		
		System.out.println("After finally");
		return returnValue;
	}
	
	
/*	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice executed.");
		
	}*/
	
	/*//combines pointcuts.
	@Before("allGetters() && allCircleMethods()")*/
	
	//runs before a get method call with any return type.
	// ".." matches to zero or more arguments.
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	//runs before all methods in the Circle class.
	@Pointcut("within(ca.owenpeterson.model.Circle)")
	public void allCircleMethods(){}

	//runs before all methods in any class within the model package.
	@Pointcut("within(ca.owenpeterson.model.*)")
	public void allModelMethods(){}
	
	//takes class name or interface as arguments. Looks for methods with matching arguments.
	@Pointcut("args()")
	public void forArgs() {
		
	}
	
}
