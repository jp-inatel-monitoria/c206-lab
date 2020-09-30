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

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Joao Pedro", 123456789);
        Cliente c2 = new Cliente("Renzo", 987654321);
        
        Conta conta1 = new Conta(c1);
        conta1.deposita(3500);
        conta1.saca(1000);
        conta1.extrato();
        
        Conta conta2 = new Conta(c2);
        conta2.deposita(10250);
        conta2.saca(3750);
        conta2.extrato();
        
        System.out.println("Quantidade de clientes: " + Conta.getQtdClientes());
        
    }
    
}
