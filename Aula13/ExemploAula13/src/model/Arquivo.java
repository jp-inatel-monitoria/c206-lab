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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao_
 */
public class Arquivo {
    
   
    //metodo para salvar no arquivo
    public void salvarArquivo(List<Equipamento> equipamentos) {
        try {
            //salvando em um arquivo
            OutputStream os = new FileOutputStream("equipamentos.txt", false);
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
    public List<Equipamento> ler() {

        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Equipamento> equipamentos = new ArrayList<>();

        try {
            fin = new FileInputStream("equipamentos.txt");
            in = new ObjectInputStream(fin);

            equipamentos = (ArrayList<Equipamento>) in.readObject();
           
            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return equipamentos;
    }

}
