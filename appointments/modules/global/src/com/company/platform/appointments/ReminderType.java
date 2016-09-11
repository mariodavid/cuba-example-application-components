package com.company.platform.appointments;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ReminderType implements EnumClass<String> {

    NOTIFICATION("NOTIFICATION"),
    EMAIL("EMAIL");

    private String id;

    ReminderType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ReminderType fromId(String id) {
        for (ReminderType at : ReminderType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}