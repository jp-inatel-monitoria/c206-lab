/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09exercicio02;

/**
 *
 * @author joao_
 */
public class Geladeira extends Mercadoria{
    
    private int qtdPortas;
    private int tamanho;
    private String tipo;

    public Geladeira(int qtdPortas, int tamanho, String tipo, int codigo, String fabricante, String descricao, double valor) {
        super(codigo, fabricante, descricao, valor);
        this.qtdPortas = qtdPortas;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
    
    
}
