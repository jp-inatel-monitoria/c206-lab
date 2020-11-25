/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author joao_
 */
public class Carrinho {
    
    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }
    
    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void listarCompra(){
        Collections.sort(produtos);
        Collections.reverse(produtos); // DESAFIO
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
        }
    }
    
}
