/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.config;

import com.gambira.config.ConfigurationYml;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author hcl
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ConfigurationYml.class, initializers = ConfigFileApplicationContextInitializer.class)
//@ActiveProfiles("test")
@EnableAutoConfiguration
@TestPropertySource(properties = { "spring.config.location=classpath:application.yml" })
public class ConfigurationYmlTest {

    @Autowired
    ConfigurationYml configurationYml;

    @Test
    public void aplicationConfigLoad() {
        assertTrue(this.configurationYml.getNomeAplicacao().contains("Gambira"));
        assertTrue(this.configurationYml.getMensagemUsuario().contains("Vantagens"));
    }
    
    @Test
    public void aplicationConfigLoadTrancodes() {
        assertTrue(this.configurationYml.getTrancodes().size() == 2);
    }
}
