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
public class Notebook extends Equipamento {
    
    private int numero;

    public Notebook(int numero, String marca, String modelo, long matricula) {
        super(marca, modelo, matricula);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Numero: " + numero);
    }
   
}
