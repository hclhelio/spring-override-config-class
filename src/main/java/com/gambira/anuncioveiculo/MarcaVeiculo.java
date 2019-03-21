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
public class MarcaVeiculo {
    
    private long id;
    
    private String nomeMarca;

    public MarcaVeiculo(long id, String nomeMarca) {
        this.id = id;
        this.nomeMarca = nomeMarca;
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
    
}
