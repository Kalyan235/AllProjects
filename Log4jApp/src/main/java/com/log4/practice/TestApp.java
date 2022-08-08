package com.log4.practice;

import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestApp {

	private static Logger logger = Logger.getLogger(TestApp.class);

	public static void main(String[] args) {

		// Create Layout.......
		// Layout layout = new SimpleLayout(); ****1

		// Layout layout = new HTMLLayout(); ****2

		// Layout layout = new XMLLayout(); ****3

		Layout layout = new PatternLayout("%p,%d,%m,%c,%n");

		// Layout link with Appender.....
		// Appender app = new ConsoleAppender(layout);

		Appender app;
		try {
			app = new FileAppender(layout, "C:\\Users\\hi\\OneDrive\\Documents\\Log4j\\log.txt");
			logger.addAppender(app);
		} catch (IOException e) {

			e.printStackTrace();
		}

		// Link Appender with Logger......

// **** Log4J Properties Adding (Simple Way)****	

		logger.debug("FROM DEBUG");
		logger.info("FROM INFO");
		logger.warn("FROM WARN");
		logger.error("FROM ERROR");
		logger.fatal("FROM FATAL");

	}

}
