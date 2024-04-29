package org.sillysociety.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class LoginPageController {

    @GetMapping("/colors")
    public String index() {
        return "colors";
    }
}
