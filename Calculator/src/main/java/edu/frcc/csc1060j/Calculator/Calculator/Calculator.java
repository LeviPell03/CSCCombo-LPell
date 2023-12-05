package edu.frcc.csc1060j.Calculator.Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
	
	private static final Logger logger = LogManager.getLogger();
	public int add(int a, int b) {
		logger.info("add was called");
		logger.debug("Returning" + a+b);
		return a + b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}

}
