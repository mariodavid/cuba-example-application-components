-- begin APPOINTMENTS_APPOINTMENT
create table APPOINTMENTS_APPOINTMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STARTS timestamp not null,
    TITLE varchar(255) not null,
    DESCRIPTION longvarchar,
    CATEGORY_ID varchar(36),
    ENDS timestamp not null,
    --
    primary key (ID)
)^
-- end APPOINTMENTS_APPOINTMENT
-- begin APPOINTMENTS_APPOINTMENT_CATEGORY
create table APPOINTMENTS_APPOINTMENT_CATEGORY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end APPOINTMENTS_APPOINTMENT_CATEGORY
-- begin APPOINTMENTS_APPOINTMENT_REMINDER
create table APPOINTMENTS_APPOINTMENT_REMINDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PERIOD integer not null,
    PERIOD_UNIT varchar(50) not null,
    TYPE_ varchar(50) not null,
    APPOINTMENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end APPOINTMENTS_APPOINTMENT_REMINDER
-- begin APPOINTMENTS_APPOINTMENT_FILE_DESCRIPTOR_LINK
create table APPOINTMENTS_APPOINTMENT_FILE_DESCRIPTOR_LINK (
    APPOINTMENT_ID varchar(36) not null,
    FILE_DESCRIPTOR_ID varchar(36) not null,
    primary key (APPOINTMENT_ID, FILE_DESCRIPTOR_ID)
)^
-- end APPOINTMENTS_APPOINTMENT_FILE_DESCRIPTOR_LINK
