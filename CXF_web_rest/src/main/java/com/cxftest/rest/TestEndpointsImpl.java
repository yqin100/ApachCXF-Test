package com.cxftest.rest;

import org.apache.log4j.Logger;

public class TestEndpointsImpl implements TestEndpoints {
    private final Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public String getHelloWorld(String input) {
		String s = "Hello World, " + input + "!";
		log.debug(s);
		return s;
	}
}
