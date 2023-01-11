package org.spring.thymeleafpj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/adminindex")
    public String adminindex(){
        return "pages/admin/adminindex";
    }
}
