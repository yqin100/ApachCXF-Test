package com.cxftest.service;

import com.cxftest.model.TestResponse;

public interface TestService {
	String getHelloWorld(String input);
	TestResponse getHelloWorldObject(String input);
}
