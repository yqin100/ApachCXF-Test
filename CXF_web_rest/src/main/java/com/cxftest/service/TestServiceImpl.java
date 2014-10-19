package com.cxftest.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    private final Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public String getHelloWorld(String input) {
		String s = "Hello World, " + input + "!";
		log.debug(s);
		return s;
	}
}
