package com.dreamix.serviceproviderapp;

import com.dreamix.serviceproviderapi.DemoProvider;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.ClassUtils;

import java.util.ArrayList;
import java.util.List;

public class DemoProviderService {

    public DemoProviderService() { }

    public DemoProvider getDemoProvider() {
        DemoProvider demoProvider;

        String providerName = getLoadedProviderName();

        try {
            Class<?> instanceClass = ClassUtils.forName(providerName, null);

            demoProvider = (DemoProvider) instanceClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Cannot instantiate " + providerName, e);
        }

        return demoProvider;
    }

    private String getLoadedProviderName() {

        List<String> names = new ArrayList<>(SpringFactoriesLoader.loadFactoryNames(DemoProvider.class, null));

        if (names.isEmpty()) {
            throw new IllegalArgumentException("Cannot find any Provider implementation");
        }

        if (names.size() > 1) {
            throw new IllegalArgumentException("Found more than one Provider implementation while only one is allowed");
        }

        return names.getFirst().toString();
    }

}
