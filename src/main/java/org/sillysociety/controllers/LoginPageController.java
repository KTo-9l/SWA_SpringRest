package org.sillysociety.controllers;

import org.sillysociety.models.swa.User;
import org.sillysociety.service.ExperimentBrigadeService;
import org.sillysociety.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginPageController {
    @Autowired
    private UserService userService;
    @Autowired
    private ExperimentBrigadeService experimentBrigadeService;

    @PostMapping("login")
    public String login(@RequestParam String login, @RequestParam String pass) {
        User user = userService.getByLogin(login);
        if (user != null && user.getPassword().equals(pass)) {
            if (user.getRole().equals("admin")) {
                return "redirect:/getUsers";
            } else {
                return "redirect:/getExperiments";
            }
        } else {
            return "index";
        }
    }

    @GetMapping("register")
    public String registerGet() {
        return "register";
    }
    @GetMapping("/colors")
    public String index() {
        return "colors";
    }
    @GetMapping("/getUsers")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("exp_br", experimentBrigadeService.getAllExperimentBrigades());
        return "allUsers";
    }
    @GetMapping("/getExperiments")
    public String hello(Model model) {
        model.addAttribute("exp_br", experimentBrigadeService.getAllExperimentBrigades());
        return "experiments";
    }
}
