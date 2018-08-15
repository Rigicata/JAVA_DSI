/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

/**
 *
 * @author aluno
 */
public class PojetoCadeira {
    String cor;
    String material;
    boolean braco;
    float altura;
    double valor;
    
    public void Personalizar (String cor, String material,boolean braco,float altura){
        this.cor = cor;
        this.braco = braco;
        this.altura = altura;
        this.material = material;
    }
   public void atribuirValor (float altura){
       double valoracrescido;
      if(this.altura>0 && this.altura<=1){
          this.valor=50.00;
      }else if(this.altura>1 && this.altura<=1.5){
          this.valor = 100.00;
      }else if (this.altura>1.5){
          this.valor = 150.00;
      }
      if(this.braco){
          valoracrescido = this.valor*0.20;
          this.valor += valoracrescido; 
      }
   }
}
