package com.dreamix.serviceproviderext;


public class ExtDemoProvider implements com.dreamix.serviceproviderapi.DemoProvider{

    @Override
    public void createDummyProvider() {
        System.out.println("Create Dummy Provider");
    }
}
