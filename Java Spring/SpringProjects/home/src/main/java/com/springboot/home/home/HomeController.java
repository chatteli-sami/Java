package com.springboot.home.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@RestController

public class HomeController {
    @RequestMapping("/greeting")
    public String index() {
        return "Hello user !";
    }

    @RequestMapping(value = "/greeting/hello")
    public String hello() {
        return "Hello world! What route did you use to access me?";
    }

    @RequestMapping("/greeting/goodbye")
    public String world() {
        return "Goodbye world!";
    }

}
