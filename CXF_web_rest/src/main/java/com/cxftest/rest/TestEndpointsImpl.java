package com.cxftest.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cxftest.model.TestResponse;
import com.cxftest.service.TestService;

public class TestEndpointsImpl implements TestEndpoints {
    private final Logger log = Logger.getLogger(this.getClass());
    @Autowired
    private TestService testService;
	
	@Override
	public String getHelloWorldTextPath(String input) {
		log.debug("Test endpoints text path called input = " + input);
		return testService.getHelloWorld(input);
	}

	@Override
	public String getHelloWorldTextQuery(String input) {
		log.debug("Test endpoints text query called input = " + input);
		return testService.getHelloWorld(input);
	}

	@Override
	public TestResponse getHelloWorldXmlPath(String input) {
		log.debug("Test endpoints xml path called input = " + input);
		return testService.getHelloWorldObject(input);
	}

	@Override
	public TestResponse getHelloWorldXmlQuery(String input) {
		log.debug("Test endpoints xml query called input = " + input);
		return testService.getHelloWorldObject(input);
	}

	@Override
	public TestResponse getHelloWorldJsonPath(String input) {
		log.debug("Test endpoints json path called input = " + input);
		return testService.getHelloWorldObject(input);
	}

	@Override
	public TestResponse getHelloWorldJsonQuery(String input) {
		log.debug("Test endpoints json query called input = " + input);
		return testService.getHelloWorldObject(input);
	}
}
