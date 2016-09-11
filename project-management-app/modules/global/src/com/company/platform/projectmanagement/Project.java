package com.company.platform.projectmanagement;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.company.platform.appointments.Appointment;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Set;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.company.platform.NamedEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "PM_PROJECT")
@Entity(name = "pm$Project")
public class Project extends StandardEntity {
    private static final long serialVersionUID = 4392202175447216061L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @JoinTable(name = "PM_PROJECT_APPOINTMENT_LINK",
        joinColumns = @JoinColumn(name = "PROJECT_ID"),
        inverseJoinColumns = @JoinColumn(name = "APPOINTMENT_ID"))
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToMany
    protected Set<Appointment> appointments;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }

    public Set<Appointment> getAppointments() {
        return appointments;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


}