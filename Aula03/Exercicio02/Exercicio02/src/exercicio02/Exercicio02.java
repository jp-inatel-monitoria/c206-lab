/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author joao_
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu peso");
        double weight = sc.nextDouble();

        System.out.println("Entre com sua altura");
        double height = sc.nextDouble();

        double imc = weight / (height * height);
        
        System.out.printf("%s %.2f %n", "IMC: ", imc);
        
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal (Parabéns)");
        } else if (imc <= 29.9) {
            System.out.println("Levemente assima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }

        sc.close();
    }

}
