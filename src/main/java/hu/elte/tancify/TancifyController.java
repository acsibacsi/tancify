package hu.elte.tancify;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TancifyController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("name", "TANCIFY!!!");
        return "index";
    }

}