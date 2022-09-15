package com.codeinspace.interactivetabletop.lib.abstracts;

import javafx.geometry.Point3D;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class LocationBase {
    private final UUID UID;
    private String name;
    private String desc;
    private Map<String, Point3D> coords = new HashMap<>();

    public LocationBase(String name, String desc, Point3D @NotNull [] coords) {
        this.name = name;
        this.desc = desc;
        this.coords.put("x", coords[0]);
        this.coords.put("y", coords[1]);
        this.coords.put("z", coords[2]);
        this.UID = UUID.randomUUID();
    }

    protected String getName() { return name; }
    protected void setName(String name) { this.name = name; }

}
