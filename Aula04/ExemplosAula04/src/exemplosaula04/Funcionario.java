/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosaula04;

/**
 *
 * @author joao_
 */
public class Funcionario {
    
    //Atributos
    public int idade;
    public int cpf;
    public double salario;
    public String nome;
    
    //Construtor
    public Funcionario(int idade, int cpf, double salario, String nome) {
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.nome = nome;
    }
    
    //Métodos
    public void tirarFerias(String mes){
        System.out.println(nome + " tirou férias no mês de " + mes);
    }
    
    public double calculaSalarioAnual(){
        double salarioAnual;
        salarioAnual = salario * 12;
        return salarioAnual;
    }
    
    public double calculaSalarioAnual(double decimoTerceiro){
        double salarioAnual;
        salarioAnual = calculaSalarioAnual() + decimoTerceiro;
        return salarioAnual;
    }
    
  
}
