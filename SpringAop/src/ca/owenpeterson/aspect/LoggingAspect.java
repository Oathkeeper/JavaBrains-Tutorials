package ca.owenpeterson.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	

	//combines pointcuts.
	@Before("allGetters() && allCircleMethods()")
	public void loggingAdvice() {
		System.out.println("Advice run. Get method called.");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice executed.");
		
	}
	
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
