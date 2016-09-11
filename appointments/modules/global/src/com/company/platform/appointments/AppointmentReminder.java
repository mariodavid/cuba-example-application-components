package com.company.platform.appointments;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s %s|period,periodUnit")
@Table(name = "APPOINTMENTS_APPOINTMENT_REMINDER")
@Entity(name = "appointments$AppointmentReminder")
public class AppointmentReminder extends StandardEntity {
    private static final long serialVersionUID = 4451432652347626682L;

    @Column(name = "PERIOD", nullable = false)
    protected Integer period;

    @Column(name = "PERIOD_UNIT", nullable = false)
    protected String periodUnit;

    @Column(name = "TYPE_", nullable = false)
    protected String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "APPOINTMENT_ID")
    protected Appointment appointment;

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Appointment getAppointment() {
        return appointment;
    }


    public void setType(ReminderType type) {
        this.type = type == null ? null : type.getId();
    }

    public ReminderType getType() {
        return type == null ? null : ReminderType.fromId(type);
    }


    public void setPeriodUnit(PeriodUnit periodUnit) {
        this.periodUnit = periodUnit == null ? null : periodUnit.getId();
    }

    public PeriodUnit getPeriodUnit() {
        return periodUnit == null ? null : PeriodUnit.fromId(periodUnit);
    }


    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getPeriod() {
        return period;
    }


}