/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joao_
 */
public class Notebook extends Equipamento{
    
    private int numero;

    public Notebook(int numero, String marca, String modelo, int matricula, String condicao) {
        super(marca, modelo, matricula, condicao);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    
}
