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
    private ArrayList<Porta> portas;
    private ArrayList<String> corcasa;
    
    
    
    public Casa() {
        this.portas = new ArrayList<>();
        this.corcasa = new ArrayList<>();
       
    }

    public ArrayList<String> getCorcasa() {
        return corcasa;
    }

    public void setCorcasa(ArrayList<String> corcasa) {
        this.corcasa = corcasa;
    }
   

  

    

   public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }

    
    
    public int quantasPortasEstaoAbertas(int contador){
      int portasabertas =0;
      for (int i =0;i<this.portas.size();i++){
          if(contador%2==0){
             portasabertas++; 
          }else {
              portasabertas+=0;
          }
          
      }
      return portasabertas;
      
    }
    public int totalDePortas(){
        
        return this.portas.size();
      
    
    }
    
                
    public void cadastraPorta(Porta porta){
        this.portas.add(porta); 
    }
     public void cadastraCor(String corcasa){
        this.corcasa.add(corcasa); 
    }

    
}
