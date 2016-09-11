package com.company.platform.appointments;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "APPOINTMENTS_APPOINTMENT_CATEGORY")
@Entity(name = "appointments$AppointmentCategory")
public class AppointmentCategory extends StandardEntity {
    private static final long serialVersionUID = 3517216271261775912L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}