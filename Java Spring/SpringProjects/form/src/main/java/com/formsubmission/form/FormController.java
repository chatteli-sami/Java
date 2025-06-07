package com.formsubmission.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password) {
        return "result.jsp";
    }
}
