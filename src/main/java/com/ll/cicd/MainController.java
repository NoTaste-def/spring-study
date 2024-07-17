package com.ll.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/cicd")
    @ResponseBody
    public String index(){
        return "Hello! Welcome to CI/CD";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }

}
