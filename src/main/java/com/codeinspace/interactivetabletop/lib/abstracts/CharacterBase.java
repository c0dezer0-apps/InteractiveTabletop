package com.codeinspace.interactivetabletop.lib.abstracts;

import com.codeinspace.interactivetabletop.lib.exceptions.SameNameValue;

import java.util.UUID;

/**
 * Base for all character types.
 * @author Brian Blankenship
 * @since 1.0.0
 * @version 1.0.0
 */
public abstract class CharacterBase  {
	private final UUID UID;
	private String firstName;
	private String lastName;
	private String desc;
	private int age;
	
	protected CharacterBase(String firstName, String lastName, String desc, int age) {
		this.UID = UUID.randomUUID();

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
		return age;
	}
	
	/**
	 * Sets the name of the character.
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param age of character.
	 */
	protected void setAge(int age) {
		this.age = age;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @return The first name of the character.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param firstName The first name to set.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @return The last name of the character.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param lastName the last name to set.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @return Character what does the character look like (account for current loadout)?
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param desc the description to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * Used to make it easier to generate a new name.
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @param firstName character first name.
	 * @param lastName character last name.
	 */
	public abstract void changeName(String firstName, String lastName) throws SameNameValue;
	
}
