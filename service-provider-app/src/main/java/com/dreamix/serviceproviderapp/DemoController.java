package com.dreamix.serviceproviderapp;

import com.dreamix.serviceproviderapi.DemoProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoProvider demoProvider;

    @GetMapping
    public void demo() {
        demoProvider.createDummyProvider();
    }
}
