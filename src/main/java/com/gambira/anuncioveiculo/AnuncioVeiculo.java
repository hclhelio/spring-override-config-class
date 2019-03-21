/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gambira.anuncioveiculo;

import java.awt.image.BufferedImage;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author hcl
 */
@Data
public class AnuncioVeiculo {
    
    
    private long id;
    
    @NotNull(message = "O campos 'título' é de preenchimento obrigatório")
    private String titulo;
    
    @NotNull(message = "O campos 'descricao' é de preenchimento obrigatório")
    private String descricao;
    
    @NotNull(message = "O campos 'marca' é de preenchimento obrigatório")
    private String marca;
    
    @NotNull(message = "O campos 'ano' é de preenchimento obrigatório")
    private long ano;
    
    @NotNull(message = "O campos 'ano do modelo' é de preenchimento obrigatório")
    private long anoModelo;
    
    private String modelo;
    
    private String versao;
    
    private List<BufferedImage> fotos;
    
    private boolean auncioPago = false;

    public AnuncioVeiculo(){
    }
    
    public AnuncioVeiculo(String titulo, String descricao, String marca, long ano, long anoModelo, String modelo, String versao, List<BufferedImage> fotos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.marca = marca;
        this.ano = ano;
        this.anoModelo = anoModelo;
        this.modelo = modelo;
        this.versao = versao;
        this.fotos = fotos;
    }

 
    @Override
    public String toString() {
        return "AnuncioVeiculo{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", marca=" + marca + ", ano=" + ano + ", anoModelo=" + anoModelo + ", modelo=" + modelo + ", versao=" + versao + ", fotos=" + fotos + ", auncioPago=" + auncioPago + '}';
    }
    
    
    
    
    
    
}
