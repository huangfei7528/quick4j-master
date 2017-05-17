package com.eliteams.quick4j.test.tomcat;


public class QuickStrap {

	public static void main(String[] args) {
		
		new TomcatBootstrapHelper(8080, false, "dev").start();
		
	}
	
}
