/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.greeting;

import com.hcl.config.ConfigProperties;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcl
 */
@RestController
public class GreetingController {
    
    private static final AtomicLong count = new AtomicLong();
    private static final String template = "Hello %s!!!";
    

    @Autowired
    ConfigProperties configProperties;
    
    @RequestMapping (value = "/greeting", method = RequestMethod.GET)
    public Greeting greeating(@RequestParam(value = "name", defaultValue = "programador") String name){        
        Greeting g = new Greeting(count.incrementAndGet(), String.format(template, name));
        g.setNomeSistema(configProperties.getAppName());
        g.getName();
        return g;
    }
    
}
