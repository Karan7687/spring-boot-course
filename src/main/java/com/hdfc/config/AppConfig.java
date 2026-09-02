package com.hdfc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.hdfc")


public class AppConfig {

    @Bean
    public List<String> getCities() {

        List<String> cities = new ArrayList<>(List.of("delhi", "mumbai", "Pune"));
        return cities;
    }
    @Bean
    public List<String> getNames() {

        List<String> cities = new ArrayList<>(List.of("A", "B", "C"));
        return cities;
    }
}
