package com.cxftest.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cxftest.model.TestResponse;

@Service
public class TestServiceImpl implements TestService {
    private final Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public String getHelloWorld(String input) {
		String s = "Hello World, " + input + "!";
		log.debug(s);
		return s;
	}

	@Override
	public TestResponse getHelloWorldObject(String input) {
		String output = getHelloWorld(input);
		TestResponse response = new TestResponse(input, output);
		log.debug("Create response " + response);
		return response;
	}
}
