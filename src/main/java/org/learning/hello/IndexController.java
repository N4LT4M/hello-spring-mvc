package org.learning.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(){
        return "homepage";
    }

    @GetMapping("/about")
    public String aboutUS(){
        return "about-us";
    }

    @GetMapping("/terms")
    public String termsAndConditions(){
        return "terms-and-conditions";
    }
}
