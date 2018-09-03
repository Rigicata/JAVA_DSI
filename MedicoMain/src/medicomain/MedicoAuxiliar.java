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
public class MedicoAuxiliar extends Medico {

    @Override
    public int Aposentadoria() {
       if (this.idade >=60){
           return 1;
       }else {
           return 0;
       }
    }

    
    
    
    
    
    
}
