package com.company.platform.projectmanagement;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.company.platform.NamedEntity;

@NamePattern("%s %s|firstName,name")
@Table(name = "PM_CUSTOMER")
@Entity(name = "pm$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 2177962844431617273L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTHDAY")
    protected Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }


}