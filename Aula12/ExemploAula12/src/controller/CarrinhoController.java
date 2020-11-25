/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Carrinho;
import model.Produto;

/**
 *
 * @author joao_
 */
public class CarrinhoController {
    
    public static Carrinho carrinho = new Carrinho();
    
    public static void addProduto(Produto produto){
        carrinho.addProduto(produto);
    }
    
    public static void listar(){
        carrinho.listarCompra();
    }
    
}
