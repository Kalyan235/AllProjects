package com.log4.practice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class BasicHelloWorld {

	private static Logger LOGGER = Logger.getLogger("BasicHelloWorld.class");

	public static void main(String[] args) {

		LOGGER.setLevel(Level.DEBUG);
		LOGGER.info("hello");

		System.out.println("Hello World");

	}

}
