package com.codeinspace.interactivetabletop.lib.constants;

import com.codeinspace.interactivetabletop.lib.enums.Type;

public record ItemType(Type type) {
    public ItemType(Type type) {
        this.type = type;
    }
}
