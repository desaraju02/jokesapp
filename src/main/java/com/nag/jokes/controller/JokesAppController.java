package com.nag.jokes.controller;

import com.nag.jokes.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesAppController {

    private JokesService jokesService;

    @Autowired
    public JokesAppController(JokesService jokesService) {
        this.jokesService = jokesService;
    }


    @RequestMapping("/")
    public String showJoke(Model model)
    {
        model.addAttribute("joke", jokesService.getJokes());
        return "chucknorris";
    }
}
