/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author joao_
 */
public class Produto {
    
    public int codigoSerie;
    public String codigoProduto;
    public String nome;
    public String categoria;
    public int quantidade;

    public Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade) {
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }
    
    public void mostraInfo(){
        System.out.println("Código de Série: " + codigoSerie);
        System.out.println("Código do Produto: " + codigoProduto);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("---------------------------------");
    }
    
}
