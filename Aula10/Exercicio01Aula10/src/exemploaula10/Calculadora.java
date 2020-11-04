/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploaula10;

/**
 *
 * @author joao_
 */
public class Calculadora {

    private int num1;
    private int num2;

    public int soma() {
        return num1 + num2;
    }

    public int subtracao() {
        return num1 - num2;
    }

    public int multiplicacao() {
        return num1 * num2;
    }

    public int divisao() {
        int result = 0;
        try {
            result = num1 / num2;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}
