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
public class Notebook implements Redimensionar {

    @Override
    public ArrayList <Float> Redimensionar(Conteudo conteudo) {
       float tam;
       
       tam = conteudo.getTamanho();
       tam += tam*1.0;
      return tam;
    }
    
}
