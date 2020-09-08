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
public class Restaurante {
    
    public String nome;
    public String endereco;
    public String cnpj;
    
    public Fornecedor[] fornecedores;
    
    public Restaurante(String nome, String endereco, String cnpj, Fornecedor[] fornecedores) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.fornecedores = fornecedores;
        
        for (int i = 0; i < fornecedores.length; i++) {
            if(fornecedores[i] == null){
                fornecedores[i] = new Fornecedor();
            }
        }
        
    }
    
    public void exibirInfos(){
        System.out.println("--- {RESTAURANTE} ---");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CNPJ: " + cnpj);
        
        System.out.println("--- {FORNECEDORES} ---");
        for (int i = 0; i < fornecedores.length ; i++) {
            if(fornecedores[i].tipo != null){
                System.out.println("Tipo: " + fornecedores[i].tipo);
                System.out.println("Quantidade: " + fornecedores[i].quantidade + " KG");
                System.out.println("-----------------------------------------");
            }
        }
    }
    
}
