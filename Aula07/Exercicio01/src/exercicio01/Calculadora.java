/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author joao_
 */
public class Calculadora {
    
    public static final double PI = 3.14;
    
    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }
    
    public static double volume(double raio){
        return 4.0 * PI * Math.pow(raio, 3) / 3.0; 
    }
    
}
