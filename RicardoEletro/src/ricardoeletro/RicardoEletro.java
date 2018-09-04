/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoeletro;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class RicardoEletro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Liquidificador liqui = new Liquidificador();
        Batedeira batedeira = new Batedeira();
        Ferro ferro = new Ferro();
        Calendar calendario = Calendar.getInstance();
        
        
        String[] voltagem ={"POTENTE","NORMAL"};
        String[] voltagemesp={"POTENTE","NORMAL","USB"};
        String [] compra = {"Liquidificador","Ferro","Batedeira"};
        String [] opcao = {"EletroFabrica","Eletro para Vender"};
        Tampa tampa = new Tampa();
        String cor,descricao;
        int capacidade,quantidade,mes;
        do {
            String entradaprinci = (String) JOptionPane.showInputDialog(null, "Escolha uma das nossas opções","O que dejesas?",JOptionPane.QUESTION_MESSAGE,null,opcao,opcao[0]);
            if(entradaprinci== "EletroFabrica"){
                do{
                    
                  String entradaeletro = (String) JOptionPane.showInputDialog(null, "Escolha uma das nossas opções","O que dejesas?",JOptionPane.QUESTION_MESSAGE,null,compra,compra[0]);
                  switch(entradaeletro){
                      case "Liquidificador":
                          
                          liqui.setMarca(JOptionPane.showInputDialog(null, "Digite a marca", "Informações do liquidificador", 1));
                          liqui.AtribuirVoltagem((String)JOptionPane.showInputDialog(null, "Escolha uma das nossas opções", "O que desejas?", JOptionPane.QUESTION_MESSAGE,null,voltagem,voltagem[0]));
                          capacidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a capacidade do liquidificador?", "Informações do liquidificador", 1));
                          quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade do liquidificador?", "Informações do liquidificador", 1));
                          tampa.setCor(JOptionPane.showInputDialog(null, "Digite a cor do liquidificador", "Informacoes do liquidificador", 0));
                          tampa.setDescricao(JOptionPane.showInputDialog(null, "Digite a descricao do liquidificador", "Informacoes do liquidificador", 0));
                          liqui.setTampa(tampa);
                          //Imprimindo
                          System.out.println("Imprimindo a marca: "+liqui.getMarca()+"\nImprimindo a voltagem"+liqui.getVoltagem()+"\nImprimindo a média de litros: "+liqui.MedirLitros(capacidade, quantidade)+"\nImprimindo a cor: "+liqui.getTampa().getCor()+"\nImprimindo a descricao: "+liqui.getTampa().getDescricao());                          
                          
                          
                          break;
                          
                          
                      case "Ferro":
                          ferro.setMarca(JOptionPane.showInputDialog(null, "Digite a marca", "Informações do ferro", 1));
                          ferro.AtribuirVoltagem((String)JOptionPane.showInputDialog(null, "Escolha uma das nossas opções", "O que desejas?", JOptionPane.QUESTION_MESSAGE,null,voltagemesp,voltagemesp[0]));
                          
                          
                          //Imprimindo
                          System.out.println("Imprimindo a marca: "+ferro.getMarca()+"\nImprimindo a voltagem"+ferro.getVoltagem());                          
                          
                          
                          
                          
                          break;
                      case "Batedeira":
                          batedeira.setMarca(JOptionPane.showInputDialog(null, "Digite a marca", "Informações da batedeira", 1));
                          batedeira.AtribuirVoltagem((String)JOptionPane.showInputDialog(null, "Escolha uma das nossas opções", "O que desejas?", JOptionPane.QUESTION_MESSAGE,null,voltagem,voltagem[0]));
                          capacidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a capacidade da batedeira?", "Informações da batedeira", 1));
                          quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade da batedeira?", "Informações da batedeira", 1));
                          batedeira.setQtdHelices(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de hélices", "Informações da batedeira", 1)));
                          
                          
                          //Imprimindo
                          System.out.println("Imprimindo a marca: "+batedeira.getMarca()+"\nImprimindo a voltagem"+batedeira.getVoltagem()+"\nImprimindo a média de litros: "+batedeira.MedirLitros(capacidade, quantidade));     
                          
                          break;
                      
                      
                      
                      
                  }
                    
                    
                }while (JOptionPane.showConfirmDialog(null,"Deseja fazer algo a mais no nosso sistema", "Compra mais algum Eletro de Fabrica", 0)==0);
                
                
                
                
                
                
                
                
                
                
                
                
                
            }else{ // Eletro para vender
                do{
                  String entradaeletro = (String) JOptionPane.showInputDialog(null, "Escolha uma das nossas opções","O que dejesas?",JOptionPane.QUESTION_MESSAGE,null,compra,compra[0]);
                  switch(entradaeletro){
                       case "Liquidificador":
                          
                         
                          liqui.setMarca(JOptionPane.showInputDialog(null, "Digite a marca", "Informações do liquidificador", 1));
                          liqui.AtribuirVoltagem((String)JOptionPane.showInputDialog(null, "Escolha uma das nossas opções", "O que desejas?", JOptionPane.QUESTION_MESSAGE,null,voltagem,voltagem[0]));
                          liqui.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do liquidificador", "Informações do liquidificador", 0)));
                          capacidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a capacidade do liquidificador?", "Informações do liquidificador", 1));
                          quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade do liquidificador?", "Informações do liquidificador", 1));
                          mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês", "Informações do liquidificador",1));
                          tampa.setCor(JOptionPane.showInputDialog(null, "Digite a cor do liquidificador", "Informacoes do liquidificador", 0));
                          tampa.setDescricao(JOptionPane.showInputDialog(null, "Digite a descricao do liquidificador", "Informacoes do liquidificador", 0));
                          liqui.setTampa(tampa);
                          //Imprimindo
                          System.out.println("Imprimindo a marca: "+liqui.getMarca()+"\nImprimindo a voltagem"+liqui.getVoltagem()+"\nImprimindo a média de litros: "+liqui.MedirLitros(capacidade, quantidade)+"\nImprimindo o valor: "+liqui.Desconto(mes)+"\nImprimindo a cor:  "+liqui.getTampa().getCor()+"\nImprimindo a descricao: "+liqui.getTampa().getDescricao());                          
                          
                          
                          break;
                          
                          
                      case "Ferro":
                          ferro.setMarca(JOptionPane.showInputDialog(null, "Digite a marca", "Informações do ferro", 1));
                          ferro.AtribuirVoltagem((String)JOptionPane.showInputDialog(null, "Escolha uma das nossas opções", "O que desejas?", JOptionPane.QUESTION_MESSAGE,null,voltagemesp,voltagemesp[0]));
                          ferro.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do ferro", "Informações do ferro", 0)));
                          mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês", "Informações do ferro",1));

                          
                          //Imprimindo
                          System.out.println("Imprimindo a marca: "+ferro.getMarca()+"\nImprimindo a voltagem"+ferro.getVoltagem()+"\nImprimindo o valor do ferro: "+ferro.Desconto(mes));                          
                          
                          
                          
                          
                          break;
                      case "Batedeira":
                          batedeira.setMarca(JOptionPane.showInputDialog(null, "Digite a marca", "Informações da batedeira", 1));
                          batedeira.AtribuirVoltagem((String)JOptionPane.showInputDialog(null, "Escolha uma das nossas opções", "O que desejas?", JOptionPane.QUESTION_MESSAGE,null,voltagem,voltagem[0]));
                          batedeira.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da batedeira", "Informações da batedeira", 1)));
                          capacidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a capacidade da batedeira?", "Informações da batedeira", 1));
                          quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade da batedeira?", "Informações da batedeira", 1));
                          mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês", "Informações da batedeira",1));
                          batedeira.setQtdHelices(Integer.parseInt(JOptionPane.showInternalInputDialog(null, "Digite a quantidade de hélices","Informações da batedeira", mes)));
                          //Imprimindo
                          System.out.println("Imprimindo a marca: "+batedeira.getMarca()+"\nImprimindo a voltagem"+batedeira.getVoltagem()+"\nImprimindo a média de litros: "+batedeira.MedirLitros(capacidade, quantidade)+"\nImprimindo o valor da batedeira: "+batedeira.Desconto(mes)+"\nImprimindo a quantidade de hélices"+batedeira.getQtdHelices());     
                          
                          break;
                      
                      
                      
                      
                  }
                     
         
                }while (JOptionPane.showConfirmDialog(null, "Compra mais algum Eletro para Vender","Deseja fazer algo a mais no nosso sistema", 0)==0);
                  
                
            }   
            
            
        }while (JOptionPane.showConfirmDialog(null, "Compra mais bb","Deseja fazer algo a mais no nosso sistema", 0)==0);
    }
    
}
