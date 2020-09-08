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
public class Carrinho {
    
    public double total;
    
    public Produto[] produtos;

    public Carrinho(Produto[] produtos) {
        this.produtos = produtos;
    }
    
    public void exibirInfo(){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null){
                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Descrição: " + produtos[i].descricao);
                System.out.println("Fabricante: " + produtos[i].fabricante);
                System.out.println("Preço: " + produtos[i].preco);
                System.out.println("-------------------------------------");
            }
        }
        
        System.out.println("Total da Compra: R$" + calculaTotal());
        
    }
    
    public double calculaTotal(){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null){
                total += produtos[i].preco;
            }
        }
        return total;
    }
    
}
