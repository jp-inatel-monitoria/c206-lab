/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author joao_
 */
public class Exercicio03 {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        double firstNumber = sc.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double secondNumber = sc.nextDouble();
        
        int op = -1;
        
        while(op != 0) {
            
            System.out.println("--- [CALCULADORA] ---");
            System.out.println("[1] - SOMA");
            System.out.println("[2] - SUBTRAÇÃO");
            System.out.println("[3] - MULTIPLICAÇÃO");
            System.out.println("[4] - DIVISÃO");
            System.out.println("[0] - SAIR");
            
            System.out.println("Escolha uma opção");
            op = sc.nextInt();
            
            switch(op) {
                case 1:
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    break;
                    
                case 2:
                    System.out.println("Result: " + (firstNumber - secondNumber));
                    break;
                    
                case 3:
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;
                    
                case 4:
                    if(secondNumber == 0) {
                        System.out.println("Invalid Number");
                    }else{
                        System.out.println("Result: " + (firstNumber / secondNumber));
                    }
                    break;
                    
                case 0: break;
            }
            
        }
        
        sc.close();
        
    }
    
}
