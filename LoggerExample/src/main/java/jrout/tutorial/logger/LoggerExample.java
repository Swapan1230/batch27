package jrout.tutorial.logger;

import org.apache.log4j.Logger;

public class LoggerExample {
	private static Logger log = Logger.getLogger(LoggerExample.class);
	
	public static void main(String[] args) {
		boolean showlogs = false;
		
		log.info("I am at starting of the application");
		
		/////
		////
		///
		log.debug("I m taking to the database....");
		///
		
		log.info("I am at End of the application");
	}

}
