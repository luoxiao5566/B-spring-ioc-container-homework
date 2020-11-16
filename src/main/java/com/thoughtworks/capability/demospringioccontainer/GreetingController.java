package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class GreetingController {

    @Lookup
    public abstract GreetingService getGreetingService();

    @GetMapping("/greet")
    public String greet() {
        return getGreetingService().sayHi();
    }

}

