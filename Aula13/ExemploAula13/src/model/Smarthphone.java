/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joao_
 */
public class Smarthphone extends Equipamento{
    
    private String imei;
    private double custo;

    public Smarthphone(String imei, double custo, String marca, String modelo, int matricula, String condicao) {
        super(marca, modelo, matricula, condicao);
        this.imei = imei;
        this.custo = custo;
    }
  
}
