/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gambira.config;

import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author hcl
 */
@Configuration
@ConfigurationProperties
@Data
public class ConfigurationYml {
    
    private String nomeAplicacao;
    private String mensagemUsuario;
    private List<Trancode> trancodes;
}
