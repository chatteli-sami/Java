package com.javaspring.hellohuman.hellohuman;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String greet(@RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "last_name", required = false) String lastName) {
        if (name == null || name.trim().isEmpty()) {
            name = "human";
        }
        String greeting = "Hello " + name;
        if (lastName != null && !lastName.trim().isEmpty()) {
            greeting += " " + lastName;
        }
        return greeting;
    }

    @GetMapping(value = "/repeat/{times}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String repeatGreet(@PathVariable("times") int times,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "last_name", required = false) String lastName) {
        if (name == null || name.trim().isEmpty()) {
            name = "human";
        }
        String greeting = "Hello " + name;
        if (lastName != null && !lastName.trim().isEmpty()) {
            greeting += " " + lastName;
        }

        StringBuilder repeatedGreeting = new StringBuilder();
        for (int i = 0; i < times; i++) {
            repeatedGreeting.append(greeting);
            if (i < times - 1) {
                repeatedGreeting.append("\n");
            }
        }
        return repeatedGreeting.toString();
    }
}
