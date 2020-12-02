/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Arquivo;
import model.Equipamento;


/**
 *
 * @author joao_
 */
public class ArquivoController {
    
    private static Arquivo arquivo;
    
    public static void cadastrarEquipamento(ArrayList<Equipamento> equipamentos){ 
        arquivo = new Arquivo();
        arquivo.salvarArquivo(equipamentos);
    }
    
    public static List<Equipamento> listarEquipamentos(){
        arquivo = new Arquivo();
        return arquivo.ler();
    }
    
}
