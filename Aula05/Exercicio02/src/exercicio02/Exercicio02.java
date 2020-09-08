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
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Contato c1 = new Contato("João Pedro", "joaopedrosouza@gec.inatel.br", "35999760853", "20/12/1996");
        Contato c2 = new Contato("Gustavo Pessa", "gustavo@gmail.com", "35999123456", "02/08/1997");
    
        Empresa empresa = new Empresa("123456789", "Rua Quito Carneiro, 282"); 
        empresa.contatos = new Contato[5];
        
        empresa.contatos[0] = c1;
        empresa.contatos[1] = c2;
        
        empresa.exibirInfo();
                
    }
    
}
