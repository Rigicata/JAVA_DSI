/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abreaportamariquinha;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Casa {
    ArrayList<Porta> portas;
    private String corcasa;

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }

    public String getCorcasa() {
        return corcasa;
    }

    
    public void PintaCasa(String corcasa){
         this.corcasa = corcasa;
    }
    
    /*public int quantasPortasEstaoAbertas(){
        
    }
    public int totalDePortas(){
    
    
    }
    
                */
    public void cadastraPorta(Porta porta){
        this.portas.add(porta); 
    }

    public Casa(String corcasa) {
        this.portas = new ArrayList<>();
        this.corcasa = corcasa;
    }
}
