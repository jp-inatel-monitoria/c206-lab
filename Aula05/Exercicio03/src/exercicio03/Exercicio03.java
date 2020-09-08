/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author joao_
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fornecedor[] fornecedores = new Fornecedor[5];
        Restaurante restaurante = new Restaurante("Huragano", "Rua Oswaldo de Oliveira, 123", "987654321", fornecedores);
        
        restaurante.fornecedores[0].tipo = "Frutos do Mar";
        restaurante.fornecedores[0].quantidade = 20;
        
        restaurante.fornecedores[1].tipo = "Carnes";
        restaurante.fornecedores[1].quantidade = 50;
        
        restaurante.exibirInfos();
        
    }
    
}
