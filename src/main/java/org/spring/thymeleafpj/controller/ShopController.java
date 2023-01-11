package org.spring.thymeleafpj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @GetMapping("/shopindex")
    public String shopindex(){
        return "pages/shop/shopindex";
    }
}
