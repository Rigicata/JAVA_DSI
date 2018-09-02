/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abreaportamariquinha;

/**
 *
 * @author aluno
 */
public class Porta {
    private String corporta ;
    private boolean aberta;
    private double dimensaoX;
    private double  dimensaoY;
    private double dimensaoZ;
    
    

    public String getCorPorta() {
        return corporta;
    }
 
    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    
    
    
    
    
    
    
    //                                          MÉTODOS
    
    public void Abre (){
        this.aberta = true;
    }
    public void Fecha (){
        this.aberta = false;
    }
    public void Pinta(String corporta){
        this.corporta = corporta;
    }
    public boolean estaAberta(){
        return this.aberta;
    } 
    
    
    }

