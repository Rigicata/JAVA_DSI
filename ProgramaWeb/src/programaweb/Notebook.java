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
public class Notebook implements Redimensionar {

    @Override
    public float Redimensionar(Conteudo conteudo) {
       float tam;
       
       tam = conteudo.getTamanho();
       tam += tam*1.0;
      return tam;
    }
    
}
