package com.cxftest.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestResponse implements Serializable {
	private static final long serialVersionUID = -2013665573115364067L;
	private String input;
	private String output;
	
	public TestResponse() {
		super();
	}

	public TestResponse(String input, String output) {
		this();
		this.input = input;
		this.output = output;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	@Override
	public String toString() {
		return "TestResponse [input=" + input + ", output=" + output + "]";
	}
}
