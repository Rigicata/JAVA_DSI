/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoeletro;

/**
 *
 * @author wesle
 */
public abstract class Eletro {
    protected String marca;
    protected double preco;
    protected int voltagem;
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void AtribuirVoltagem(String voltagem) {
       if (voltagem == "POTENTE"){
           this.voltagem =220;
       }else {
           this.voltagem =110;
       }
       
     
          
    }
    
    
    
       public abstract double Desconto(int mes);
       
    
    
   
    
   
    public double MedirLitros(int capacidade,int quantidade){
        return capacidade/quantidade;
    }
}
