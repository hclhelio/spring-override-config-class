/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.greeting;

import lombok.Data;



/**
 *
 * @author hcl
 */

@Data
public class Greeting {

    private long id;
    private String name;
    private String nomeSistema;

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
