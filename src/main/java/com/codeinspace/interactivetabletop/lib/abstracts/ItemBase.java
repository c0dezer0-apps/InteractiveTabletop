package com.codeinspace.interactivetabletop.lib.abstracts;

import com.codeinspace.interactivetabletop.lib.enums.Type;

public abstract class ItemBase extends EntityBase {
    /*
    *   Items stats:
    *   health
    *   class
    *   dimensions
    *   weight
    *   volume
    *   category
    *   type (equipment, container, consumable, clothing, wearable)
    * */
    private int health;
    private String itemClass;

    public ItemBase(String name, Type type, String desc, String itemClass, int health) {
        super(name, type, desc);

        this.itemClass = itemClass;
        this.health = health;
    }
}
