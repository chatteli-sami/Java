package com.ex.session;

import org.springframework.stereotype.Controller;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
    @RequestMapping("/")
    public String index(HttpSession session) {
        session.setAttribute("count", 0);
        return "index.jsp";
    }
}
