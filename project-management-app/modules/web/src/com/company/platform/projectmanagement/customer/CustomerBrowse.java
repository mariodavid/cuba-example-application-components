package com.company.platform.projectmanagement.customer;

import com.company.platform.main.SayHelloService;
import com.company.platform.projectmanagement.Customer;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Table;

import javax.inject.Inject;
import java.util.Set;

public class CustomerBrowse extends AbstractLookup {

    @Inject
    SayHelloService sayHelloService;

    @Inject
    Table<Customer> customersTable;

    public void sayHello(Component source) {

        for (Customer c : customersTable.getSelected()) {
            String customerName = c.getName();
            String firstName = c.getFirstName();

            if (firstName != null && firstName != "") {
                customerName += ", " + firstName;
            }

            String helloString = sayHelloService.sayHello(customerName);
            showNotification(helloString, NotificationType.TRAY);
        }
    }
}