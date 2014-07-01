package ca.owenpeterson;
import org.slf4j.*;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		//System.out.println("Hello World!");
		Logger logger = LoggerFactory.getLogger(HelloWorld.class);
		logger.info("Hello World!");
	}

}
