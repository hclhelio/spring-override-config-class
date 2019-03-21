/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.greeting;

import com.gambira.greeting.Greeting;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcl
 */
public class GreetingTest {
    
    public GreetingTest() {
    }
    
    @Test
    public void gettersAndSettersLombokTest(){
        Greeting g = new Greeting(0, "Hélio");
        
        assertEquals(g.getName(), "Hélio");        
        assertEquals(Long.valueOf(g.getId()), Long.valueOf(0));        
    }
    
}
