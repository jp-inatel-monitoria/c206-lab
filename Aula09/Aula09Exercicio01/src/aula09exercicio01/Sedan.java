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
public class Sedan extends Carro{
    
    private int portaMalas;

    public Sedan(int portaMalas, double valor, String cor, int ano) {
        super(valor, cor, ano);
        this.portaMalas = portaMalas;
    }

    @Override
    public void taxa() {
        setValor(getValor() + 3000);
    }

    @Override
    public void mostraInfo() {
        System.out.println("Cor: " + getCor());
        System.out.println("Valor: " + getValor());
        System.out.println("Ano: " + getAno());
        System.out.println("Porta malas: " + portaMalas);
    }
    
}
