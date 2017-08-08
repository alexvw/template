package com.alexvw.template.web;

import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
}