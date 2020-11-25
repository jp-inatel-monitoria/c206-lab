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
public class Produto implements Comparable<Produto>{
    
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    //I - Ordem Crescente de preço
    @Override
    public int compareTo(Produto p) {
        return Double.compare(this.preco, p.preco);
    }
    
    // II - Ordem alfabetica
    /*
    @Override
    public int compareTo(Produto p) {
        return this.nome.compareTo(p.nome);
    }*/

   
}
