package org.spydrone13.app.gs_maven;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class HelloWorld {
	public static void main( String[] args ) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
