/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicomain;

/**
 *
 * @author aluno
 */
public class MedicoCirurgiao extends Medico {
    
    @Override
    public int Aposentadoria() {
       if (this.idade >=50){
           return 1;
       }else {
           return 0;
       }
    }

    @Override
    public double ValorAponsentadoria() {
        return super.ValorAponsentadoria()+800; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
