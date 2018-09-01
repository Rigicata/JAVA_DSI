/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospedagem;

import java.util.ArrayList;

/**
 *
 * @author wesle
 */
public class VemArray {
    private ArrayList<Passagem> passagens;
    private ArrayList<PasseioTuristico> passeiosturisticos;
    private ArrayList<Translado> translados;
    private ArrayList<Hospedagem> hospedagens;

    
    
    
    // Métodos Get e Sets padrão
    public ArrayList<Passagem> getPassagens() {
        return this.passagens;
    }

    public void setPassagens(ArrayList<Passagem> passagens) {
        this.passagens = passagens;
    }

    public ArrayList<PasseioTuristico> getPasseiosturisticos() {
        return this.passeiosturisticos;
    }

    public void setPasseiosturisticos(ArrayList<PasseioTuristico> passeiosturisticos) {
        this.passeiosturisticos = passeiosturisticos;
    }

    public ArrayList<Translado> getTranslados() {
        return this.translados;
    }

    public void setTranslados(ArrayList<Translado> translados) {
        this.translados = translados;
    }

    public ArrayList<Hospedagem> getHospedagens() {
        return this.hospedagens;
    }
    
    
    
    
    
    
    
    
    // Métodos Sets passando somente um de cada vez
    public void setHospedagens(ArrayList<Hospedagem> hospedagens) {
        this.hospedagens = hospedagens;
    } 
    public void setHospedagem (Hospedagem hospedagem){
        this.hospedagens.add(hospedagem);
    }
    public void setPasseioTuristico (PasseioTuristico passeioturistico){
        this.passeiosturisticos.add(passeioturistico);
    }
    public void setPassagem (Passagem passagem){
        this.passagens.add(passagem);
    }
    public void setTranslado (Translado translado){
        this.translados.add(translado);
    }

    public VemArray() {
        this.hospedagens= new ArrayList<>();
        this.passagens = new ArrayList<>();
        this.passeiosturisticos = new ArrayList<>();
        this.translados = new ArrayList<>();
    }
    
    
}
