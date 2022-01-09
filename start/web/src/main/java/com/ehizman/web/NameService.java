package com.ehizman.web;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {
    private RestTemplate restTemplate;
    private static final String URL = "http://localhost:9092";

    public NameService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getName(){
       return restTemplate.getForObject(URL, String.class);
    }
}
