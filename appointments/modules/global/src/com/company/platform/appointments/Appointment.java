package com.company.platform.appointments;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.FileDescriptor;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.OneToMany;
import javax.persistence.Lob;

@NamePattern("%s (%s - %s)|title,starts,ends")
@Table(name = "APPOINTMENTS_APPOINTMENT")
@Entity(name = "appointments$Appointment")
public class Appointment extends StandardEntity {
    private static final long serialVersionUID = 3003048294984157170L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "STARTS", nullable = false)
    protected Date starts;

    @Column(name = "TITLE", nullable = false)
    protected String title;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @JoinTable(name = "APPOINTMENTS_APPOINTMENT_FILE_DESCRIPTOR_LINK",
        joinColumns = @JoinColumn(name = "APPOINTMENT_ID"),
        inverseJoinColumns = @JoinColumn(name = "FILE_DESCRIPTOR_ID"))
    @ManyToMany
    protected Set<FileDescriptor> attachements;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    protected AppointmentCategory category;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "appointment")
    protected Set<AppointmentReminder> reminder;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ENDS", nullable = false)
    protected Date ends;

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public Date getStarts() {
        return starts;
    }

    public void setEnds(Date ends) {
        this.ends = ends;
    }

    public Date getEnds() {
        return ends;
    }


    public void setReminder(Set<AppointmentReminder> reminder) {
        this.reminder = reminder;
    }

    public Set<AppointmentReminder> getReminder() {
        return reminder;
    }


    public void setCategory(AppointmentCategory category) {
        this.category = category;
    }

    public AppointmentCategory getCategory() {
        return category;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAttachements(Set<FileDescriptor> attachements) {
        this.attachements = attachements;
    }

    public Set<FileDescriptor> getAttachements() {
        return attachements;
    }


}