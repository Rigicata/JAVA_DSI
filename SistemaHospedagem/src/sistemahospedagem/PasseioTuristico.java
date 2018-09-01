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
public class PasseioTuristico {
    private String dia;
    private int horario;
    private int tempotot;
    private double valor=0;
    private ArrayList<PasseioTuristico> passeios;
    public PasseioTuristico(){
        this.passeios = new ArrayList();
    }

    public ArrayList<PasseioTuristico> getPasseios() {
        return passeios;
    }

    public void setPasseios(ArrayList<PasseioTuristico> passeios) {
        this.passeios = passeios;
    }
    
    public void CadastraPasseio (PasseioTuristico passeio){
        this.passeios.add(passeio);
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getTempotot() {
        return tempotot;
    }

    public void setTempotot(int tempotot) {
        this.tempotot = tempotot;
    }

    public double getValor() {
        return valor;
    }

    public void CalculaValorPasseio(Translado translado) {
        int valorhora =0;
        if(this.horario == 1){
            valorhora = 50;
        }else if (this.horario == 2){
            valorhora = 75;
        }else {
            valorhora = 100;
        }
        this.valor = translado.getValorpadrao() * valorhora;
    }
    
    
}
