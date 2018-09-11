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
public abstract class Artista {
    
    protected int cpf;
    protected int ano;
    protected int tempservico;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTempservico() {
        return tempservico;
    }

    public void setTempservico(int tempservico) {
        this.tempservico = tempservico;
    }
    
    
}
