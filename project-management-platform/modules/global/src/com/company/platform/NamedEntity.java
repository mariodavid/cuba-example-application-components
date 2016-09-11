package com.company.platform;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@MappedSuperclass
public class NamedEntity extends StandardEntity {
    private static final long serialVersionUID = -1120023642823380059L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "DESCRIPTION")
    protected String description;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}