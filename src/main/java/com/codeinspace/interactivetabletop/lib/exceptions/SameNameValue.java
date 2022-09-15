package com.codeinspace.interactivetabletop.lib.exceptions;

/**
 * This error is produced when a user tries to to use the same name as the previous when altering
 * character name.
 * @author Brian Blankenship
 * @since 1.0.0
 * @version 1.0.0
 */
public class SameNameValue extends Exception {
	private static final long serialVersionUID = 5918001787282243528L;
	
	SameNameValue() {}

	public SameNameValue(String err) {
		super(err);
	}
}
