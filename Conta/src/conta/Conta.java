
package conta;


public class Conta {
    String agencia;
    String numero;
    double saldo;
    String CPF;
    double limite;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

  
    
    
    
    
    public void DepositaConta(double deposito){
      double novoSaldo = this.saldo + deposito;
      this.saldo = novoSaldo;
      
    }
    
    
    
    
       
  public boolean SacaConta(double quantidade){
      double tot = this.limite+this.saldo;
    if(tot>=quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
        
            return true;
    }else {
            return false;
    }
      

}

    
   public boolean TransfereConta (double valor,Conta conta){
           if (this.SacaConta(valor)){
               conta.DepositaConta(valor);
               return true;
           }else{
               return false;
           }
       
       
   }
}    