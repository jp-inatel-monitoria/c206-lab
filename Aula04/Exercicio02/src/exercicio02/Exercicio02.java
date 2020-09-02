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
        
        Carro c1 = new Carro("Preto", "Ford", "Fiesta", 200, 0, new Motor("50 cavalos", "Flex"));
        System.out.println(c1.toString());
        
        Carro c2 = new Carro("Branco", "Audi", "Audi TT", 280, 120, new Motor("150 cavalos", "Flex"));
        System.out.println(c2);
    }
    
}
