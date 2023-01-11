package org.spring.thymeleafpj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class MainController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
