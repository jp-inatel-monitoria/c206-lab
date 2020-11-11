/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ArquivoController;
import model.Equipamento;
import model.Notebook;
import model.Smartphone;

/**
 *
 * @author joao_
 */
public class ExercicioAula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Equipamento[] equipamentos = new Equipamento[2];

        equipamentos[0] = new Notebook(1, "Notebook Dell", "Inspiron 7572", 0215);
        equipamentos[1] = new Smartphone("ATT564@", 2500, "Samsung", "Galaxy", 3256);

        ArquivoController.salvar(equipamentos);

        for (Equipamento equipamento : ArquivoController.ler()) {
            equipamento.mostraInfo();
            System.out.println("-------------------");
        }

    }

}
