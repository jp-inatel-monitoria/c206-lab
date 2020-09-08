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
public class Exercicio01 {

    
    public static void main(String[] args) {
       
        Produto[] produtos = new Produto[5];
        
        Produto p1 = new Produto("Iphone XR", "Celular", "Apple", 2999.90);
        Produto p2 = new Produto("Geladeira", "Eletrodoméstico", "Consul", 1499.99);
        Produto p3 = new Produto("Fone de ouvido", "Melhor fone", "Beats", 749.90);
        
        produtos[0] = p1;
        produtos[1] = p2;
        produtos[2] = p3;
        
        Carrinho c = new Carrinho(produtos);
        c.exibirInfo();
        
    }
    
}
