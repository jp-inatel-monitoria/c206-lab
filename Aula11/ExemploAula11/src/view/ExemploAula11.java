/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ArquivoObjetoController;
import model.Usuario;

/**
 *
 * @author joao_
 */
public class ExemploAula11 {

    public static void main(String[] args) {
        
        
        Usuario[] usuarios = new Usuario[3];
        usuarios[0] = new Usuario("joaopedrosouza@gec.inatel.br", "123456");
        usuarios[1] = new Usuario("joao_giacometti@hotmail.com", "987654321");
        usuarios[2] = new Usuario("gustavo@gmail.com", "987654321");
        
        ArquivoObjetoController.salvar(usuarios);
        
        for (Usuario usuario : ArquivoObjetoController.ler()) {
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getSenha());
            System.out.println("------------------");
        }
        
        for (int i = 0; i < ArquivoObjetoController.ler().length; i++) {
            System.out.println(ArquivoObjetoController.ler()[i].getEmail());
        }
        
    }

}
