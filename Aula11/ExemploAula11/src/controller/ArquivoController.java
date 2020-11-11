/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Arquivo;

/**
 *
 * @author joao_
 */
public class ArquivoController {
    
    private static Arquivo arquivo;
    
    public static void salvar(String texto){
        arquivo = new Arquivo();
        arquivo.salvar(texto);
    }
    
    public static void ler(String linha){
        arquivo = new Arquivo();
        arquivo.ler(linha);
    }
    
}
