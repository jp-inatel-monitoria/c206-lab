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
public class Smartphone extends Equipamento {
    
    private String imei;
    private double custo;

    public Smartphone(String imei, double custo, String marca, String modelo, long matricula) {
        super(marca, modelo, matricula);
        this.imei = imei;
        this.custo = custo;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("IMEI: " + imei);
        System.out.println("Custo: " + custo);
    }
   
}
