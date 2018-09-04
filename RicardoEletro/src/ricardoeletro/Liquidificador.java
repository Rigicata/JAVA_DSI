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

    @Override
    public double Desconto(int mes) {
        if (mes==9){
            return this.preco*0.10;
        }else {
            return this.preco;
        }
    }

   
    
    
}
