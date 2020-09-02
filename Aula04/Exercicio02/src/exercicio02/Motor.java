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
public class Motor {
    
    public String potencia;
    public String tipo;

    public Motor(String potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", tipo=" + tipo + '}';
    }
  
  
}
