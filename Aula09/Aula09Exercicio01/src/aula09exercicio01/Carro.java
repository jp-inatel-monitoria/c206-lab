/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09exercicio01;

/**
 *
 * @author joao_
 */
public abstract class Carro implements Controle{
    
    private double valor;
    private String cor;
    private int ano;

    public Carro(double valor, String cor, int ano) {
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
    
    
}
