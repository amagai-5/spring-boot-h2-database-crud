package com.bezkoder.spring.jpa.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Amagai
 * @version 1.0
  */
@SpringBootApplication
public class SpringBootJpaH2Application {
	/**
	 * THis is main method to run SpringBoot
	 * @param args
	 */

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger();
		logger.trace("Start");

		SpringApplication.run(SpringBootJpaH2Application.class, args);

		logger.trace("End");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warning");
		logger.error("error");
		logger.fatal("fatal");
	}

}
