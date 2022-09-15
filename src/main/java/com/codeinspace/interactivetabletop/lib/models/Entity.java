package com.codeinspace.interactivetabletop.lib.models;

import com.codeinspace.interactivetabletop.lib.abstracts.EntityBase;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.codeinspace.interactivetabletop.lib.enums.Type;
import com.codeinspace.interactivetabletop.utils.Notify;

/**
 *	Represents an entity. All game objects, such as characters, ships, and
 *	other items would be considered an Entity.
 *
 * @author Brian Blankenship
 * @since 1.0.0
 * @see PlayerCharacter
 */
public class Entity extends EntityBase {
	private final UUID cUID;
	private Type cType;
	private String cName;
	private String cDesc;
	
	public Entity(String name, Type type, String desc) {
		super(name, type, desc);

		this.cUID = UUID.randomUUID();
		this.cType = type;
		this.cName = name;
		this.cDesc = desc;

		Notify.info("New Entity created:\n");
		Notify.fine("Entity created.", this);
	}

	@Override
	protected String getUID() {
		return cUID.toString();
	}
	
	@Override
	protected Type getType() {
		return cType;
	}
	
	@Override
	protected void setType(Type type) {
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

	@Override
	protected String getDesc() { return cDesc; }

	@Override
	protected void setDesc(String desc) { this.cDesc = desc; }
	
	/**
	 * Returns all relevant data to the Entity. In order to get a specific value, Map.get()
	 * method must be utilized, for ex:
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
				Notify.warn("Encountered an error while fetching Entity details.");
			}
		}
		return lDetails;
	}
}
