package com.codingdojo.raikichiroutes.raikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiRoutesController {
    @RequestMapping("/daikichi")
    public String welcome() {
        return "Welcome";
    }

    @RequestMapping(value = "/daikichi/today")
    public String today() {
        return "Today you will find luck in all your endeavors !";
    }

    @RequestMapping("/daikichi/tomorrow")
    public String tomorrow() {
        return "Tomorrow, on apportunity will arise, so be sure to be open to new ideas!!";
    }
}
