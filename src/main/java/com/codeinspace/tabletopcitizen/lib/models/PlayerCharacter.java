package com.codeinspace.tabletopcitizen.lib.models;

import com.codeinspace.tabletopcitizen.lib.abstracts.CharacterBase;
import com.codeinspace.tabletopcitizen.lib.exceptions.SameNameValue;

/**
 * Represents a character played by a player.
 * 
 * @author Brian Blankenship
 * @since 1.0.0
 * @see com.codeinspace.tabletopcitizen.lib.models.Entity
 */
public class PlayerCharacter extends CharacterBase {
    private String pFirstName;
    private String pLastName;
    private String pDesc;
    private String pBio;
    private int pAge;

    public PlayerCharacter (String firstName, String lastName, String desc, int age) {
    	super(firstName, lastName, desc, age);

        pFirstName = firstName;
        pLastName = lastName;
        pDesc = desc;
        pAge = age;
    }
    
    public String getBio() {
    	return pBio;
    }
    
    public void setBio(String bio) {
    	this.pBio = bio;
    }
    
    @Override
    public String getFirstName() {
    	return pFirstName;
    }
    
    @Override
    public void setFirstName(String firstName) {
    	this.pFirstName = firstName;
    }
    
    @Override
    public String getLastName() {
    	return pLastName;
    }
    
    @Override
    public void setLastName(String lastName) {
    	this.pLastName = lastName;
    }
    
    @Override
    public String getDesc() {
    	return pDesc;
    }
    
    @Override
    public void setDesc(String desc) {
    	this.pDesc = desc;
    }
    
    @Override
    public int getAge() {
    	return pAge;
    }
    
    @Override
    public void setAge(int age) {
    	this.pAge = age;
    }

	@Override
	public void changeName(String firstName, String lastName) throws SameNameValue {
		if (firstName != null && firstName.equals(this.pFirstName) || lastName.equals(this.pLastName)) {
			throw new SameNameValue("Cannot be the same value as the original.");
		}
		
		setFirstName(firstName);
		setLastName(lastName);
	}
}
