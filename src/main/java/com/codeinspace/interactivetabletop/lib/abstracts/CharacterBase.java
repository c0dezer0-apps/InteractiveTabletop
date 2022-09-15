package com.codeinspace.interactivetabletop.lib.abstracts;

import com.codeinspace.interactivetabletop.lib.exceptions.SameNameValue;

public abstract class CharacterBase  {
	private String pFirstName;
	private String pLastName;
	private String pDesc;
	private int pAge;
	
	protected CharacterBase(String firstName, String lastName, String desc, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setDesc(desc);
		setAge(age);
	}
	
	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @return Age of character.
	 */
	public int getAge() {
		return pAge;
	}
	
	/**
	 * Sets the name of the character.
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param age of character.
	 */
	protected void setAge(int age) {
		this.pAge = age;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @return The first name of the character.
	 */
	public String getFirstName() {
		return pFirstName;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param iFirstName The first name to set.
	 */
	public void setFirstName(String iFirstName) {
		this.pFirstName = iFirstName;
	}
	
	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @return The last name of the character.
	 */
	public String getLastName() {
		return pLastName;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param iLastName the last name to set.
	 */
	public void setLastName(String iLastName) {
		this.pLastName = iLastName;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @return Character what does the character look like (account for current loadout)?
	 */
	public String getDesc() {
		return pDesc;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param desc the description to set
	 */
	public void setDesc(String desc) {
		this.pDesc = desc;
	}
	
	/**
	 * Used to make it easier to generate a new name.
	 * 
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param firstName character first name.
	 * @param lastName character last name.
	 */
	public abstract void changeName(String firstName, String lastName) throws SameNameValue;
	
}
