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
public class Aula09Exercicio02 {

    
    public static void main(String[] args) {
        
        Mercadoria fogao = new Fogao(4, "Automatico", 01, "Eletrolux", "Um bom fogão", 999);
        Mercadoria geladeira = new Geladeira(2, 30, "Inox", 02, "Eltrolux", "Uma boa geladeira", 1500);
        
        if(fogao instanceof Fogao){
            Fogao fogaoAux = (Fogao)fogao;
            fogaoAux.setQuantidadeBocas(2);
        }
        
    }
    
}
