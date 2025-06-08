package com.exampleflash.flash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("dojoName", "burbank");
        return "index.jsp";
    }

    @RequestMapping("/createError")
    public String flashMessage(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "test error");
        return "redirect:/";
    }

}
