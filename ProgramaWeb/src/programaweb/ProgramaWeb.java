/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaweb;

/**
 *
 * @author aluno
 */
public class ProgramaWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Desktop d= new Desktop();
        Conteudo link = new Link();
        
        
        link.setCor("Azivis");
        link.setTamanho(12);
        System.out.println(d.Redimensionar(link));
        
        
    }
    
}
