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
public class Conta {

    private static int qtdClientes;
    private double saldo;

    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        qtdClientes++;
    }

    public void deposita(double valor) {
        saldo = valor;
        System.out.println("Valor depositado: " + valor);
        System.out.println("SALDO TOTAL: " + saldo);
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
            System.out.println("SALDO TOTAL: " + saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void extrato() {
        System.out.println("-------- [EXTRATO] -------");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Saldo: " + saldo);
        System.out.println("--------------------------");
    }
    
    public static int getQtdClientes() {
        return qtdClientes;
    }

}
