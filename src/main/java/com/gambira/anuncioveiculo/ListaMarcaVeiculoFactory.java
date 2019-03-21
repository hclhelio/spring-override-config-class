/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gambira.anuncioveiculo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
/*
Chevrolet
Citroën
Fiat
Ford
Honda
Hyundai
Iveco
JAC
Jeep
Nissan
Kia
Toyota
Troller
Volkswagen
---
Agrale
Aston Martin
Audi
Bentley
BMW
BYD
Changan
Chery
Chrysler
Dodge
Dongfeng
Effa
Ferrari
Foton
Geely
Hafei
Jaguar
Jinbei
Lamborghini
Land Rover
Lexus
Lifan
Maserati
McLaren
Mercedes
Mercedes
Mini
Mitsubishi
Peugeot
Porsche
RAM
Rely
Renault
Rolls
Shineray
Smart
SsangYong
Subaru
Suzuki
TAC
Tesla
Volvo
*/
/**
 *
 * @author hcl
 */
public class ListaMarcaVeiculoFactory {
    
    public List<MarcaVeiculo> getMarcasMaisConhecidas(){
        
        String strMarcas = "Agrale:Agrale:Aston Martin:Audi:Bentley:BMW:BYD:Changan:Chery:Chevrolet:Chrysler:Citroën:Dodge:Dongfeng:Effa:Ferrari:Fiat:Ford:Foton:Geely:Hafei:Honda:Hyundai:Iveco:JAC:Jaguar:Jeep:Jinbei:Kia:Lamborghini:Land Rover:Lexus:Lifan:Maserati:McLaren:Mercedes-AMG:Mercedes-Benz:Mini:Mitsubishi:Nissan:Peugeot:Porsche:RAM:Rely:Renault:Rolls-Royce:Shineray:Smart:SsangYong:Subaru:Suzuki:TAC:Tesla:Toyota:Troller:"
                + "Volkswagen:Volvo";
        List<MarcaVeiculo> listaMarcaVeiculos = new ArrayList<>();
        AtomicLong contador = new AtomicLong();
        Arrays.asList(strMarcas.split(":")).forEach( m ->
            listaMarcaVeiculos.add(new MarcaVeiculo(contador.incrementAndGet(), m))
        );
    
        return listaMarcaVeiculos;
    }
    
}
