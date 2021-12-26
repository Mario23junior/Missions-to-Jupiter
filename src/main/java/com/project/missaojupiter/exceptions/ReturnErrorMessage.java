package com.project.missaojupiter.exceptions;

public class ReturnErrorMessage extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ReturnErrorMessage(String msg, Object tipo) {
		super(String.format(msg,tipo));
	}

}
