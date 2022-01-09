package com.ehizman.web;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {
    private RestTemplate restTemplate;
    private static final String URL = "http://localhost:9091";

    public GreetingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getGreeting(){
        return restTemplate.getForObject(URL, String.class);
    }

    public String getGreeting(String locale){
        return restTemplate.getForObject(new StringBuilder(URL).append("/").append(locale).toString(), String.class);
    }
}
