/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CarrinhoController;
import model.Produto;

/**
 *
 * @author joao_
 */
public class ExemploAula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando produtos
        Produto p1 = new Produto("Iphone", 2900);
        Produto p2 = new Produto("Monitor LG", 1500);
        Produto p3 = new Produto("Teclado", 250);
        
        //Adicionando no carrinho
        CarrinhoController.addProduto(p1);
        CarrinhoController.addProduto(p2);
        CarrinhoController.addProduto(p3);
        
        //Listando
        CarrinhoController.listar();
    }
    
}
