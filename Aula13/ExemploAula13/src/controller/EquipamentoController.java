/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Equipamento;
import model.Notebook;
import model.Smarthphone;

/**
 *
 * @author joao_
 */
public class EquipamentoController {

    private static Equipamento equipamento;
    public static List<Equipamento> equipamentos = new ArrayList<>();
    
    public static void addNotebook(int numero, String marca, String modelo, int matricula, String condicao) {
        equipamento = new Notebook(numero, marca, modelo, matricula, condicao);
        equipamentos.add(equipamento);
        ArquivoController.cadastrarEquipamento((ArrayList<Equipamento>) equipamentos);
    }
  
    public static void addSmarthphone(String imei, double custo, String marca, String modelo, int matricula, String condicao) {
        equipamento = new Smarthphone(imei, matricula, marca, modelo, matricula, condicao);
        equipamentos.add(equipamento);
        ArquivoController.cadastrarEquipamento((ArrayList<Equipamento>) equipamentos);
    }
}
