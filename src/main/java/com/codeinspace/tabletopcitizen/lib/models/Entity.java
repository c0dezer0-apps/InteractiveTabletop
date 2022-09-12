package com.codeinspace.tabletopcitizen.lib.models;

import com.codeinspace.tabletopcitizen.lib.abstracts.EntityBase;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *	Represents an entity. All game objects, such as characters, ships, and
 *	other items would be considered an Entity.
 *
 * @author Brian Blankenship
 * @since 1.0.0
 * @see com.codeinspace.tabletopcitizen.lib.models.PlayerCharacter
 */
public class Entity extends EntityBase{
	private String cType;
	private String cName;
	
	private static final Logger logger = LogManager.getLogger("EntityLogger");
	
	public Entity(String name, String type) {
		super(name, type);

		this.cType = type;
		this.cName = name;
	}
	
	@Override
	protected String getType() {
		return cType;
	}
	
	@Override
	protected void setType(String type) {
		this.cType = type;
	}
	
	@Override
	protected String getName() {
		return cName;
	}
	
	@Override
	protected void setName(String name) {
		this.cName = name;
	}
	
	/**
	 * Returns all relevant data to the Entity. In order to get a specific value, Map.get()
	 * method must be utilized, for ex:
	 * 
	 * {@code map.get(value);}
	 * @author Brian Blankenship
	 * @since 1.0.0
	 * @return A Map<String, String>. 
	 */
	@Override
	public Map<String, String> details() {
		Map<String, String> lDetails = new HashMap<>();
		
		for (Field field : this.getClass().getDeclaredFields()) {
			try {
				lDetails.put(field.getName(), field.get(this).toString());				
			}
			catch (IllegalAccessException err) {
				logger.error(err);
			}
		}
		
		return lDetails;
	}
}
