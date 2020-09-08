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
public class Produto {

    public String nome;
    public String descricao;
    public String fabricante;
    public double preco;

    public Produto(String nome, String descricao, String fabricante, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.preco = preco;
    }

}
