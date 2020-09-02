/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author joao_
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciando a classe e criando o objeto
        Produto m1 = new Produto(1, "#AS123", "Geladeira Eletrolux", "Eletrodomésticos", 5);
        Produto m2 = new Produto(2, "#FX321", "Iphone XR", "Eletrônicos", 10);
        
        //Chamando o método "mostraInfo" de cada objeto criado
        m1.mostraInfo();
        m2.mostraInfo();
        
    }
    
}
