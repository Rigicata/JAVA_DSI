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
public class Edificio {
    private String coredificio;
    private ArrayList<String> nomedosandares;
    private ArrayList<Porta> portas;

    public Edificio() {
        
        this.nomedosandares = new ArrayList<>();
        this.portas = new ArrayList<>();
    }
    

    public String getCor() {
        return coredificio;
    }


    public ArrayList<String> getNomedosandares() {
        return nomedosandares;
    }

    public void setNomedosandares(ArrayList<String> nomedosandares) {
        this.nomedosandares = nomedosandares;
    }

   
    public void Pinta (String coredificio ){
        this.coredificio = coredificio ;
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }
    
    public void CadastraPortas(Porta porta){
        this.portas.add(porta);
    }
    public void AdicionaAndar(String nome){
        this.nomedosandares.add(nome);
     }
    
    
    public int totalDeAndares(){
        int andares = 0;
        
        for (int i =0;i<this.nomedosandares.size();i++){
          andares++;
      }
      return andares;
          
        
    }
    
    
    
     public int quantasPortasEstaoAbertas(){
      int portasabertas =0;
      for (int i =0;i<this.portas.size();i++){
          portasabertas++;
      }
      return portasabertas;
      
      
      
      
    }
    public int totalDePortas(){
        
        return this.portas.size();
      
    
    }
    
    
    
    
    
}
