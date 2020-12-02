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
public abstract class Equipamento implements Serializable{
    
    private String marca;
    private String modelo;
    private int matricula;
    private String condicao;

    public Equipamento(String marca, String modelo, int matricula, String condicao) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.condicao = condicao;
    }

    public String getCondicao() {
        return condicao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMatricula() {
        return matricula;
    }
   
}
