/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hcl.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author hcl
 */
@Configuration
@PropertySource("classpath:application_2.properties")
@ConfigurationProperties(prefix = "prop")
@Data
public class ConfigProperties {
    
    private String nomeAplicacao;
    private String versao;
    
}
