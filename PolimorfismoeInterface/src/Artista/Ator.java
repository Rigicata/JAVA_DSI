/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artista;

/**
 *
 * @author aluno
 */
public class Ator extends Artista implements Pontuacao  {
    private boolean formacao;

    public boolean getFormacao() {
        return formacao;
    }

    public void setFormacao(boolean formacao) {
        this.formacao = formacao;
    }
    
    
    @Override
    public int CalculaPontuacao(int qtdApresenta) {
        if(this.formacao==true && qtdApresenta >=3){
            return 100;
        } else {
            return 0;
        }
    }


}
