/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author joao_
 */
public class Equipamento implements Serializable{
    
    private String marca;
    private String modelo;
    private long matricula;

    public Equipamento(String marca, String modelo, long matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public void mostraInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matricula: " + matricula);
    }
      
}
