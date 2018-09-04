/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoeletro;

/**
 *
 * @author wesle
 */
public class Batedeira extends Eletro{
     private int qtdHelices;
             
             
    @Override
    public double Desconto(int mes) {
        if (mes==12){
            return this.preco*0.20;
        }else {
            return this.preco;
        }
        
    }

    @Override
    public double MedirLitros(int capacidade, int quantidade) {
        return super.MedirLitros(capacidade, quantidade)*this.qtdHelices; 

    }
    
    
    
    
}
