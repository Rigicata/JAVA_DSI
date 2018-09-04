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
public class Liquidificador extends Eletro {
    private Tampa tampa;
    
    public Liquidificador() {
      
}

    public Tampa getTampa() {
        return tampa;
    }

    public void setTampa(Tampa tampa) {
        this.tampa = tampa;
    }

   
    
    

    @Override
    public double Desconto(int mes) {
         double precodes;
         if (mes==9){
             precodes=this.preco*0.15;
             return this.preco-precodes;
         }else {
             return this.preco;
         } 
    }

   
    
    
}
