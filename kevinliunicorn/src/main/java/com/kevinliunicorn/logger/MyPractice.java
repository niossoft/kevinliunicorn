package com.kevinliunicorn.logger;

import org.apache.log4j.Logger;

public class MyPractice {

	public static Logger logger = Logger.getLogger(MyPractice.class);
	public static Logger logger2 = Logger.getLogger("aa");

	public static void main(String[] args) {
		int num = 0;
		try {
			System.out.println(num / 0);
		} catch (Exception e) {
			System.out.println(e);
			logger.debug("Here is some DEBUG");
			logger.info("Here is some INFO");
			logger.warn("Here is some WARN");
			logger.error("Here is some ERROR");
			logger.fatal("Here is some FATAL");
			logger2.debug("Here is some aa logger");
			logger2.info("Here is some aa logger");
		}
	}
}
