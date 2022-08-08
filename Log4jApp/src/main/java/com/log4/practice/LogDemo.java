package com.log4.practice;

import org.apache.log4j.Logger;

public class LogDemo {
	
	private static Logger log=Logger.getLogger(LogDemo.class);
	
	public static void main(String[] args) {
		
		log.debug("FROM DEBUG");
		log.info("FROM INFO");
		log.warn("FROM WARN");
		log.error("FROM ERROR");
		log.fatal("FROM BBB");
		
		
	}

}
