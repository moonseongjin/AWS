package com.example.appec4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("/web")
public class Sample1Controller {

    @GetMapping("/nice")
    public String hi(){
        return "test";
    }
}
