package com.chainofresponsobilities;

public class Application {

	private static AbstractLogger getChaAbstractLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger infoLogger = new FileLogger(AbstractLogger.INFO);
		AbstractLogger consLogger = new ConsoleLogger(AbstractLogger.DEBUG);
		
		errorLogger.setLogger(infoLogger);
		infoLogger.setLogger(consLogger);
		return errorLogger;
	}
	
	public static void main(String[] args) {
		 AbstractLogger loggerChain = getChaAbstractLogger();

	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	}
}
