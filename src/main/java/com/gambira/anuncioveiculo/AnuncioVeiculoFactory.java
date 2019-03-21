/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gambira.anuncioveiculo;

/**
 *
 * @author hcl
 */
public class AnuncioVeiculoFactory {
    
    public static AnuncioVeiculo getAnuncioVeiculo(){
        AnuncioVeiculo anuncioSiena =  new AnuncioVeiculo();
        
        anuncioSiena.setMarca("FIAT");
        anuncioSiena.setModelo("Siena");
        anuncioSiena.setAno(2003);
        anuncioSiena.setAnoModelo(2003);
        anuncioSiena.setVersao("ELX 1.3");
        anuncioSiena.setTitulo("Vendo um siena muito conservado");
        anuncioSiena.setDescricao("Praticamente o único dono.\nEra o carro da minha mae. Sempre dirigi");
        
        
        return anuncioSiena;
          
    }
    
}
