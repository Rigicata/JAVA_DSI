/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospedagem;

/**
 *
 * @author wesle
 */
public class Translado {
    private int distancia;
    private static double valorpadrao = 50;
    private int dataida;
    private int datavolta;

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getValorpadrao() {
        return valorpadrao;
    }

    public int getDataida() {
        return dataida;
    }

    public void setDataida(Passagem passagem) {
        this.dataida = passagem.getDataida();
    }

    public int getDatavolta() {
        return datavolta;
    }

    public void setDatavolta(Passagem passagem) {
        this.datavolta = passagem.getDatavolta();
    }
    
    
}
