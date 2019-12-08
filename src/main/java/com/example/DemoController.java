/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eyvind
 */
@RestController
public class DemoController {
    
    @GetMapping("/greet/{name}")
    public String getGreeting(@PathVariable String name)
    {return "hi !!!"+name;
    }
    
}
