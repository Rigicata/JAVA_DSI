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
public class MedicoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MedicoCirurgiao medicocir = new MedicoCirurgiao();
        medicocir.setCRM("18576464");
        medicocir.setIdade(60);
        medicocir.setNome("Wesley");
        medicocir.setSalario(8000);
        if (medicocir.Aposentadoria()==1){
            System.out.println(" É aposentado\nImprimindo a idade: "+medicocir.getIdade());
        }else {
            System.out.println("Não é aposentado\nImprimindo a idade: "+medicocir.getIdade());
            
        }
        System.out.println("\n\n");
        System.out.println("Imprimindo o valor da aposentadoria"+medicocir.ValorAponsentadoria());
        System.out.println("\n\n");
        
        
        MedicoAuxiliar medicoaux = new MedicoAuxiliar();
        medicoaux.setCRM("16594848");
        medicoaux.setIdade(50);
        medicoaux.setNome("Fran");
        medicoaux.setSalario(8000);
        if (medicocir.Aposentadoria()==1){
            System.out.println(" É aposentado\nImprimindo a idade: "+medicoaux.getIdade());
        }else {
            System.out.println("Não é aposentado\nImprimindo a idade: "+medicoaux.getIdade());
            
        }
        System.out.println("\n\n");
        System.out.println("Imprimindo o valor da aposentadoria"+medicoaux.ValorAponsentadoria());
        System.out.println("\n\n");
        
        Medico medico = new Medico();
        medico.setCRM("1854878848748");
        medico.setIdade(60);
        medico.setNome("Qualquer");
        medico.setSalario(8000);
        if (medicocir.Aposentadoria()==1){
            System.out.println(" É aposentado\nImprimindo a idade: "+medico.getIdade());
        }else {
            System.out.println("Não é aposentado\nImprimindo a idade: "+medico.getIdade());
            
        }
        System.out.println("\n\n");
        System.out.println("Imprimindo o valor da aposentadoria"+medico.ValorAponsentadoria());
        
        
        
    }
    
}
