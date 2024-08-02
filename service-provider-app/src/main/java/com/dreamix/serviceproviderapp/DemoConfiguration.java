package com.dreamix.serviceproviderapp;

import com.dreamix.serviceproviderapi.DemoProvider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Bean
    public DemoProvider demoProvider() {
        DemoProviderService demoProviderService = new DemoProviderService();

        return demoProviderService.getDemoProvider();
    }
}
