/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao_
 */
public class Arquivo {
    
    OutputStream os = null;
    
    public Arquivo() {
        try {
            os = new FileOutputStream("equipamentos.txt", true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //metodo para salvar no arquivo
    public void salvarArquivo(Equipamento[] equipamentos) {
        try {
          
            ObjectOutputStream osw = new ObjectOutputStream(os);
            osw.writeObject(equipamentos);

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
    public Equipamento[] ler() {

        FileInputStream fin;
        ObjectInputStream in;

        Equipamento[] equipamentos = new Equipamento[100];

        try {
            fin = new FileInputStream("equipamentos.txt");
            in = new ObjectInputStream(fin);

            equipamentos = (Equipamento[]) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return equipamentos;
    }
}
