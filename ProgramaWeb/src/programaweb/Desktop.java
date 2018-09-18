/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaweb;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Desktop implements Redimensionar{

 
    @Override
    public ArrayList <Float> Redimensionar(ArrayList<Conteudo>conteudos) {
ArrayList <Float> novosTam = new ArrayList<>();
float novoTam;

for (int i=0;i<conteudos.size();i++){
    
 if(conteudos.get(i) instanceof Lista|| conteudos.get(i) instanceof Paragrafo){
           novoTam= conteudos.get(i).getTamanho()*0.3f;
             novoTam=novoTam+1.5f;
            
            
            
        }else {
            
           novoTam =  conteudos.get(i).getTamanho();
           novoTam=novoTam*1.2f; 
        
        }
 
 novosTam.add(novoTam);
    
   
    
    }

 return novosTam;

}
       
    
}
