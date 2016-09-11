package com.company.platform.appointments;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PeriodUnit implements EnumClass<String> {

    MINUTE("MINUTE"),
    HOUR("HOUR"),
    DAY("DAY");

    private String id;

    PeriodUnit(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PeriodUnit fromId(String id) {
        for (PeriodUnit at : PeriodUnit.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}