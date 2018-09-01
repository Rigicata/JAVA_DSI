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
public class Passagem {
    private int dataida;
    private int datavolta;
    private String cidadedestino;
    private String cidadeorigem;
    private double valor=0;
    private int codigoviagem;

    public int getCodigoviagem() {
        return codigoviagem;
    }

    public void setCodigoviagem(int codigoviagem) {
        this.codigoviagem = codigoviagem;
    }

    public int getDataida() {
        return dataida;
    }

    public void setDataida(int dataida) {
        this.dataida = dataida;
    }

    public int getDatavolta() {
        return datavolta;
    }

    public void setDatavolta(int datavolta) {
        this.datavolta = datavolta;
    }

    public String getCidadedestino() {
        return cidadedestino;
    }

    public void setCidadedestino(String cidadedestino) {
        this.cidadedestino = cidadedestino;
    }

    public String getCidadeorigem() {
        return cidadeorigem;
    }

    public void setCidadeorigem(String cidadeorigem) {
        this.cidadeorigem = cidadeorigem;
    }

    public double getValor() {
        return valor;
    }

    public void CalculaValorPassagem(String tipopassagem) {
        double valorpadrao = 200;
        if(tipopassagem.equals("Economico") && this.codigoviagem == 1){
            this.valor = valorpadrao *100;
        }else if (tipopassagem.equals("Economico") && this.codigoviagem ==2){
             this.valor = valorpadrao *200;
        }else if (tipopassagem.equals("Classe A") && this.codigoviagem ==1){
            this.valor = valorpadrao * 1000;
        } else {
            this.valor = valorpadrao * 2000;
        }
    }
        
        public double CalculaValorTot(double valortot,int pessoas) {

        if (valortot>=3000 && pessoas==1){
            return (valortot*pessoas) *0.25;
        }else if (valortot>=3000) {
            return (valortot*pessoas)*0.05;
           
        }else {
             return valortot*pessoas;
        }
    }
    }
    
    
    

