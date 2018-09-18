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
public class Dispositivo {
    private ArrayList <Conteudo> conteudos;

    public ArrayList<Conteudo> getConteudo() {
        return conteudos;
    }

    public void setConteudos(ArrayList<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    
    
    public void setConteudo (Conteudo conteudo){
        this.conteudos.add(conteudo);
    }
    
    
    
    
    
}
