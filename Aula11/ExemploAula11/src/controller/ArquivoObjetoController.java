/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ArquivoObjeto;
import model.Usuario;

/**
 *
 * @author joao_
 */
public class ArquivoObjetoController {
    
    private static ArquivoObjeto arquivoObjeto;
    
    public static void salvar(Usuario[] usuario){
        arquivoObjeto = new ArquivoObjeto();
        arquivoObjeto.salvarArquivo(usuario);
    }
    
    public static Usuario[] ler(){
        arquivoObjeto = new ArquivoObjeto();
        return arquivoObjeto.ler();
    }
    
}
