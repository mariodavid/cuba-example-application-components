package com.company.platform.main;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.company.platform.main.NamedEntity;

@Table(name = "PMP_DUMMY_NAMED_ENTITY")
@Entity(name = "pmp$DummyNamedEntity")
public class DummyNamedEntity extends NamedEntity {
    private static final long serialVersionUID = -7074049906350372026L;

}