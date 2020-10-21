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
public class Fogao extends Mercadoria{
    
    private int quantidadeBocas;
    private String tipoAcendimento;

    public Fogao(int quantidadeBocas, String tipoAcendimento, int codigo, String fabricante, String descricao, double valor) {
        super(codigo, fabricante, descricao, valor);
        this.quantidadeBocas = quantidadeBocas;
        this.tipoAcendimento = tipoAcendimento;
    }

    public void setQuantidadeBocas(int quantidadeBocas) {
        this.quantidadeBocas = quantidadeBocas;
    }
    
    
}
