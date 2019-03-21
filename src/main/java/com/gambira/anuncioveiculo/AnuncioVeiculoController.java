/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gambira.anuncioveiculo;

import com.gambira.config.ConfigurationYml;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcl
 */
@RestController
@RequestMapping("autos")
public class AnuncioVeiculoController {
    
    public static List<AnuncioVeiculo> listaAnuncioVeiculo;
    private static AtomicLong chaveAnuncio = new AtomicLong();
    
    @Autowired
    ConfigurationYml configurationYml;
    
    @GetMapping("/nomeAplicacao")
    public @ResponseBody String getNomeAplicacao(){
        return this.configurationYml.getNomeAplicacao();
    }
    
    @GetMapping
    public List<AnuncioVeiculo> getVeiculos(){
        if(listaAnuncioVeiculo == null){
            listaAnuncioVeiculo = new ArrayList<>();
        }
        return listaAnuncioVeiculo;
    }
    
    
    @PostMapping(headers = "Accept=application/json")
    public AnuncioVeiculo salvar(@Valid @RequestBody AnuncioVeiculo anuncioVeiculo){
        anuncioVeiculo.setId(chaveAnuncio.getAndIncrement());
        listaAnuncioVeiculo.add(anuncioVeiculo);
        
        return anuncioVeiculo;
    }
    
    
    @PutMapping(value = "/{id}", headers = "Accept=application/json")
    public AnuncioVeiculo update(@PathVariable Long id,@Valid @RequestBody AnuncioVeiculo anuncioVeiculo){
        
        anuncioVeiculo.setId(id);
        listaAnuncioVeiculo.set(id.intValue(), anuncioVeiculo);        
        
        return listaAnuncioVeiculo.get(id.intValue());
    }
    
}
