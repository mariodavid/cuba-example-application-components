-- begin PM_CUSTOMER
create table PM_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255) not null,
    DESCRIPTION varchar(255),
    --
    FIRST_NAME varchar(255),
    BIRTHDAY date,
    --
    primary key (ID)
)^
-- end PM_CUSTOMER
-- begin PM_PROJECT
create table PM_PROJECT (
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
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PM_PROJECT
-- begin PM_PROJECT_APPOINTMENT_LINK
create table PM_PROJECT_APPOINTMENT_LINK (
    PROJECT_ID varchar(36) not null,
    APPOINTMENT_ID varchar(36) not null,
    primary key (PROJECT_ID, APPOINTMENT_ID)
)^
-- end PM_PROJECT_APPOINTMENT_LINK
