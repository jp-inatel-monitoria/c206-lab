/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author joao_
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String CORRECT_PASSWORD = "2002";
        
        System.out.println("Digite a senha: ");
        String password = sc.nextLine();
        
        while(!password.equals(CORRECT_PASSWORD)){
            System.out.println("Senha Invalida");
            System.out.println("Digite a senha: ");
            password = sc.nextLine();
        }
        
        System.out.println("Acesso permitido");
        
        sc.close();
     
    }
    
}
