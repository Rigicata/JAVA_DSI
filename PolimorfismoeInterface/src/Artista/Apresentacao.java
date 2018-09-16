/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artista;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Apresentacao{
    
    private int qtdApresenta;
    //private ArrayList<Artista> artistas; Colocar dentro Arraylist Artista todos os Arraylists de Canto, dancarino e ator
    private ArrayList <Cantor>cantores;
    private ArrayList<Dancarino>dancarinos;
    private ArrayList <Ator> atores;
    private static int pontuacaotot;

    public ArrayList<Cantor> getCantores() {
        return cantores;
    }

    public void setCantores(ArrayList<Cantor> cantores) {
        this.cantores = cantores;
    }

    public ArrayList<Dancarino> getDancarinos() {
        return dancarinos;
    }

    public void setDancarinos(ArrayList<Dancarino> dancarinos) {
        this.dancarinos = dancarinos;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public void setAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }
    
    public void setAtor(Ator ator){
        this.atores.add(ator);
    }
    public void setDancarino(Dancarino dancarino){
        this.dancarinos.add(dancarino);
    }
    public void setCantor(Cantor cantor){
        this.cantores.add(cantor);
    }
    /*public void setArtista(Artista artista){
        this.artistas.add(artista);
    }*/
   

   

     
     public Apresentacao() {
        this.atores= new ArrayList();
        this.dancarinos= new ArrayList();
        this.cantores= new ArrayList();
        //this.artistas = new ArrayList();

        Apresentacao.pontuacaotot = Apresentacao.pontuacaotot+100;

     }
     
     public static int getPontuacaotot(int pontuacao) {
        return Apresentacao.pontuacaotot+pontuacao;
    }
    public int getQtdApresenta() {
        return qtdApresenta;
    }

    public void setQtdApresenta(int qtdApresenta) {
        this.qtdApresenta = qtdApresenta;
    }
    
 
          
    
  
    
    
    
}
