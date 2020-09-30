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
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o raio: ");
        double raio = sc.nextDouble();
        
        System.out.println("Circunferência: " + Calculadora.circunferencia(raio));
        System.out.println("Volume: " + Calculadora.volume(raio));
        System.out.println("Valor de PI é: " + Calculadora.PI);
        
    }
    
}
