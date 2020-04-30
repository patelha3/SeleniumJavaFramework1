package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo {
	
	static Logger logger = LogManager.getLogger(Log4jDemo.class.getName());
	
			
	public static void main(String[] args) {
		System.out.println("\n  Hello World! \n");
		
		logger.trace("this is trace");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is an warning message");
		logger.fatal("This is an fatal message");
		
		System.out.println("\n  Completed  \n");
	}

}
