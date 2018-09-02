/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abreaportamariquinha;

import java.util.ArrayList;

/**
 *
 * @author wesle
 */
public class FabricaDeArray {
    private ArrayList <Porta> portas;
    private ArrayList <Edificio> edificios; // O que acontece se eu criar um ArrayList de uma classe dentro dela
    private ArrayList <Casa> casas;
  
    
    
    
    
    public FabricaDeArray (){
        this.casas = new ArrayList<>();
        this.edificios = new ArrayList<>();
        this.portas = new ArrayList<>();
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }

    public ArrayList<Edificio> getEdificios() {
        return edificios;
    }

    public void setEdificios(ArrayList<Edificio> edificios) {
        this.edificios = edificios;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }
    
     public void CadastraPortas(Porta porta){
        this.portas.add(porta); // Perguntar para Fran se já que eu tenho um arraylist aqui se eu precisaria de um lá nas outras classes
    }
      public void CadastraEdificio(Edificio edificio){
        this.edificios.add(edificio);
    }
     public void CadastraCasas(Casa casa){
        this.casas.add(casa);
    }
    
}
