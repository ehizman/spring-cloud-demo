package com.ehizman.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class WebController {
    private NameService nameService;
    private GreetingService greetingService;

    public WebController(NameService nameService, GreetingService greetingService) {
        this.nameService = nameService;
        this.greetingService = greetingService;
    }

    @RequestMapping("/")
    public String index(HttpServletRequest httpServletRequest){
        String locale = RequestContextUtils.getLocaleResolver(httpServletRequest).resolveLocale(httpServletRequest).toLanguageTag();
        String greeting = greetingService.getGreeting(locale);
        String name = nameService.getName();
        log.info("Return value: {}", new StringBuilder(greeting).append(" ").append(name));
        return new StringBuilder(greeting).append(" ").append(name).toString();
    }
}
