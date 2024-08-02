package com.dreamix.serviceproviderext;

public class ExtDemoProviderTwo implements com.dreamix.serviceproviderapi.DemoProvider{

    @Override
    public void createDummyProvider() {
        System.out.println("Create Dummy Provider2");
    }
}
