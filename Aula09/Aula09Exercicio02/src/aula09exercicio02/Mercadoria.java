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
public abstract class Mercadoria {
    
    private int codigo;
    private String fabricante;
    private String descricao;
    private double valor;

    public Mercadoria(int codigo, String fabricante, String descricao, double valor) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    
    
}
