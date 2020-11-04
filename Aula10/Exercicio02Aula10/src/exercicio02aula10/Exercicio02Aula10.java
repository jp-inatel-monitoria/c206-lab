/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02aula10;

/**
 *
 * @author joao_
 */
public class Exercicio02Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta conta = new Conta(1, "João Pedro", 3500);
        
        conta.depositar(2000);
        conta.depositar(350);
        
        try{
            conta.sacar(2500);
        }catch (SaqueException e){
            System.out.println(e.getMessage());
        } 
        
    }
    
}
