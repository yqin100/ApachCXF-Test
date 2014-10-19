package com.cxftest.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cxftest.service.TestService;

public class TestEndpointsImpl implements TestEndpoints {
    private final Logger log = Logger.getLogger(this.getClass());
    @Autowired
    private TestService testService;
	
	@Override
	public String getHelloWorldPath(String input) {
		log.debug("Test endpoints path called input = " + input);
		return testService.getHelloWorld(input);
	}

	@Override
	public String getHelloWorldQuery(String input) {
		log.debug("Test endpoints query called input = " + input);
		return testService.getHelloWorld(input);
	}
	
	
}
