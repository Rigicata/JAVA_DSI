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
   private String cor;
    private String material;
    private boolean braco;
    private float altura;
    private double valor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isBraco() {
        return braco;
    }

    public void setBraco(boolean braco) {
        this.braco = braco;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getValor() {
        return valor;
    }

    
    
    public void Personalizar (String cor, String material,boolean braco,float altura){
        this.cor = cor;
        this.braco = braco;
        this.altura = altura;
        this.material = material;
    }
   public void atribuirValor (){
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
