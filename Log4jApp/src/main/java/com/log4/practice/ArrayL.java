package com.log4.practice;

import java.util.Iterator;
import java.util.LinkedList;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ArrayL {
	private static Logger log = Logger.getLogger("ArrayL.class");

	public static void main(String args[]) {
		log.setLevel(Level.DEBUG);
		LinkedList<String> al = new LinkedList<String>();
		al.add("Vikram");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add("Mahaan");

//		Iterator<String> itr = al.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			log.debug(itr.next());

		log.debug(al);
//		}
	}
}
