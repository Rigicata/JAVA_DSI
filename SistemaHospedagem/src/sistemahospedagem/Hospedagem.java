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
public class Hospedagem {
    private int diasviagem;//baseados nos dias de ida e volta
    private double valordiaria=0;
    private Passagem passagem;

    public int getDiasviagem() {
        return diasviagem;
    }

    public void setDiasviagem(Passagem passagem) {
        //Puxando esses valores do main pelos sets da passagem
        this.diasviagem= passagem.getDataida()+passagem.getDatavolta();
    }

    public double getValordiaria() {
        return valordiaria;
    }

    private void setValordiaria() {
        this.valordiaria = passagem.getValor() * 0.75; /* O dono da empresa bateu o fio para a minha pessoa e disse que
                                                        o valor da diária vai ser sempre 75%por cento o valor da passagem*/
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
