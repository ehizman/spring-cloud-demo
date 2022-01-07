package com.ehizman.greeting;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@Getter
@Setter
@ConfigurationProperties()
public class GreetingProperties {
    private String greeting;
    private Map<String, String> greetings;
}
