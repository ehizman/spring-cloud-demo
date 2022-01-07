package com.ehizman.name;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class NameController {
    private NameProperties nameProperties;

    public NameController(NameProperties nameProperties) {
        this.nameProperties = nameProperties;
    }

    @RequestMapping("/")
    public String returnName(){
        log.info("Name: {}", nameProperties.getName());
        return nameProperties.getName();
    }
}
