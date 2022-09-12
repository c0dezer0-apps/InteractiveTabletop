package com.codeinspace.tabletopcitizen.lib.exceptions;

public class SameNameValue extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5918001787282243528L;
	
	SameNameValue() {}

	public SameNameValue(String err) {
		super(err);
	}
}
