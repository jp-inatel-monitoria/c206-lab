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


    public static void main(String[] args) {
        // Resolução exerc. 01
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a tabela desejado: E/OU");
        String op = sc.nextLine().toUpperCase();
        while(!op.equals("E") && !op.equals("OU")){
            System.out.println("Entre com a tabela desejado: E/OU");
            op = sc.nextLine().toUpperCase();
        }
        
        switch(op){
            case "E":
                System.out.println("0 E 0 = 0");
                System.out.println("0 E 1 = 0");
                System.out.println("1 E 0 = 0");
                System.out.println("1 E 1 = 1");
                break;
                
            case "OU":
                System.out.println("0 OU 0 = 0");
                System.out.println("0 OU 1 = 1");
                System.out.println("1 OU 0 = 1");
                System.out.println("1 OU 1 = 1");
                break;
                
            default:break;
        }
        
        sc.close();
        
    }
    
}
