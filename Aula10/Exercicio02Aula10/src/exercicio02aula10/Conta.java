/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02aula10;

/**
 *
 * @author joao_
 */
public class Conta {
    
    private int numero;
    private String nome;
    private double saldo;
    private double limiteSaque;

    public Conta(int numero, String nome, double limiteSaque) {
        this.numero = numero;
        this.nome = nome;
        this.limiteSaque = limiteSaque;
    }
 
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Saldo atual: " + saldo);
    }
    
    public void sacar(double valor){
        if (valor > saldo){
            throw new SaqueException("Saldo insuficiente");
        }
        if (valor > limiteSaque){
            throw new SaqueException("Valor maior que o limite permitido");
        }
        
        saldo -= valor;
        System.out.println("Saldo Atual: " + saldo);
    }
    
}
