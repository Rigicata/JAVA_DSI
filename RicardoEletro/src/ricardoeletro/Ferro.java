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
public class Ferro extends Eletro{

    @Override
    public double Desconto(int mes) {
         if (mes==5){
             return this.preco*0.10;
         }else {
             return this.preco;
         }   
    }

    @Override
    public void AtribuirVoltagem(String voltagem) {
          if (voltagem == "POTENTE"){
           this.voltagem =110;
       }else if(voltagem=="NORMAL") {
           this.voltagem =220;
       }else{
           this.voltagem = 5;
       }
    }

    
    
    
    
    
}
