/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao_
 */
public class ArquivoObjeto {
    
    public OutputStream os = null;
    
     public ArquivoObjeto() {
        try {
            os = new FileOutputStream("usuarios.txt", true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   //metodo para salvar no arquivo
   public void salvarArquivo(Usuario[] usuarios) {
        try {
            //salvando em um arquivo
            ObjectOutputStream osw = new ObjectOutputStream(os);
            osw.writeObject(usuarios);

            //fechando o arquivo
            osw.close();
            os.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //método para ler o o arquivo .txt "usuario"
    public Usuario[] ler() {
        
        FileInputStream fin;
        ObjectInputStream in;
  
        Usuario[] usuarios = new Usuario[100];
        
        try {
            fin = new FileInputStream("usuarios.txt");
            in = new ObjectInputStream(fin);

            usuarios = (Usuario[]) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return usuarios;
    }
    
}
