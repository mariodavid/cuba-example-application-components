package com.company.platform.projectmanagement;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.NamePattern;
import com.company.platform.main.NamedEntity;

@NamePattern("%s |firstName")
@Table(name = "PM_CUSTOMER")
@Entity(name = "pm$Customer")
public class Customer extends NamedEntity {
    private static final long serialVersionUID = 2177962844431617273L;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTHDAY")
    protected Date birthday;


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