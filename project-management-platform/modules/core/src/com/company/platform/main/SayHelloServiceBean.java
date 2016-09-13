/*
 * TODO Copyright
 */

package com.company.platform.main;

import org.springframework.stereotype.Service;

@Service(SayHelloService.NAME)
public class SayHelloServiceBean implements SayHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}