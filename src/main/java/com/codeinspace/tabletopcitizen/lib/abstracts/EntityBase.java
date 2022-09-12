package com.codeinspace.tabletopcitizen.lib.abstracts;

import java.util.Map;

public abstract class EntityBase {
	private String cName;
	private String cType;
	
	protected EntityBase(String name, String type) {
		this.cName = name;
		this.cType = type;
	}
	
	protected String getName() {
		return cName;
	}
	
	protected void setName(String name) {
		this.cName = name;
	}
	
	protected String getType() {
		return cType;
	}
	
	protected void setType(String type) {
		this.cType = type;
	}
	
	public abstract Map<String, String> details();
}
