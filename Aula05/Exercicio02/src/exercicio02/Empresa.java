/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author joao_
 */
public class Empresa {
    
    public String cnpj;
    public String endereco;
    
    public Contato[] contatos;

    public Empresa(String cnpj, String endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
    
    public void exibirInfo(){
        System.out.println("--- {EMPRESA} ---");
        System.out.println("CNPJ: " + cnpj);
        System.out.println("ENDEREÇO: " + endereco);
        
        System.out.println("--- {CONTATOS} ---");
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null){
                System.out.println("Nome: " + contatos[i].nome);
                System.out.println("Email: " + contatos[i].email);
                System.out.println("Telefone: " + contatos[i].telefone);
                System.out.println("Data de Nascimento: " + contatos[i].dataNascimento);
                System.out.println("--------------------------------");
            }
        }
    }
    
}
