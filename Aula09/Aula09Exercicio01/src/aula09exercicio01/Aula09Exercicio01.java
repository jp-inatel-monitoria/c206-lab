/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09exercicio01;

/**
 *
 * @author joao_
 */
public class Aula09Exercicio01 {

    
    public static void main(String[] args) {
        
        Carro suv = new SUV("4x4", 75000, "Preto", 2010);
        Carro sedan = new Sedan(40, 55000, "Vermelho", 2012);
        
        suv.mostraInfo();
        suv.taxa();
        System.out.println("Novo valor: " + suv.getValor());
        System.out.println("----------------");
        sedan.mostraInfo();
        sedan.taxa();
        System.out.println("Novo valor: " + sedan.getValor());
        
    }
    
}
