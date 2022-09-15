package com.codeinspace.interactivetabletop.lib.abstracts;

import com.codeinspace.interactivetabletop.lib.enums.Type;

import java.util.Map;
import java.util.UUID;

public abstract class EntityBase {
	private String cDesc;
	private String cName;
	private Type cType;
	private final UUID cUID;

	protected EntityBase(String name, Type type, String desc) {
		this.cDesc = desc;
		this.cName = name;
		this.cType = type;
		this.cUID = UUID.randomUUID();
	}

	protected String getUID() { return cUID.toString(); }

	protected String getName() {
		return cName;
	}
	
	protected void setName(String name) {
		this.cName = name;
	}
	
	protected Type getType() {
		return cType;
	}
	
	protected void setType(Type type) {
		this.cType = type;
	}

	protected String getDesc() {
		return cDesc;
	}

	protected void setDesc(String desc) {
		this.cDesc = desc;
	}
	
	public abstract Map<String, String> details();
}
