/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploaula10;

import javax.swing.JOptionPane;

/**
 *
 * @author joao_
 */
public class ExemploAula10 {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.setNum1(Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o número 1")));
        calculadora.setNum2(Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o número 2")));
        
        JOptionPane.showMessageDialog(null, calculadora.divisao());
        
    }
    
}
