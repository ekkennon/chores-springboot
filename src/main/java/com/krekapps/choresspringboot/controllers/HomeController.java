package com.krekapps.choresspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ekk on 22-Jun-17.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "")
    public String index() {
        return "index";
    }
}
