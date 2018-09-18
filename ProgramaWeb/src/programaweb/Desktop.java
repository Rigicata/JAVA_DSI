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
public class Desktop implements Redimensionar{

 
    @Override
    public float Redimensionar(Conteudo conteudo) {
float novoTam;
        if(conteudo instanceof Lista|| conteudo instanceof Paragrafo){
           novoTam= conteudo.getTamanho()*0.3f;
             novoTam=novoTam+1.5f;
            
            
            
        }else {
            
           novoTam =  conteudo.getTamanho();
           novoTam=novoTam*1.2f; 
        
        }
    
    return novoTam;
    
    }
    
}
