package com.dehyju.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Similar to @Composable
@Controller
public class HomeController {
    // This is mapping the endpoint
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
 }
