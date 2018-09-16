
package Artista;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class PalcoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ator ator = new Ator();
        Dancarino danca= new Dancarino();
        Cantor cantor = new Cantor();
        Apresentacao apresenta = new Apresentacao();
        Baixista baixista = new Baixista();
        Baterista baterista = new Baterista();
        Guitarrista guitarrista = new Guitarrista();
        Banda banda = new Banda();
        String opcoesArtista[] = {"Cantor","Dancarino","Ator"};
         int totpontuacao=0;
        // MODIFICAR ESSE CÓDIGO PARA PEGAR DIRETO E ADD NO ARRAYLIST DE Artistas;
        
        do{
           String entrada = (String) JOptionPane.showInputDialog(null,"Escolha uma das opções", "Abrindo um teatro",JOptionPane.QUESTION_MESSAGE,null,opcoesArtista,opcoesArtista[0]);
            switch(entrada){
                case "Ator":
                    do {
                       ator.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Ator", "Cadastrando Ator", 1));
                       ator.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o CPF do Ator", "Cadastrando Ator",1)));
                       ator.setTempservico(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Tempo de Servico do Ator", "Cadastrando Ator",1)));
                       ator.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Ano de Nascimento do Ator", "Cadastrando Ator",1)));
                       int decideformar = Integer.parseInt(JOptionPane.showInputDialog(null,"Esse Ator é formado?", "Cadastrando Ator",JOptionPane.YES_NO_OPTION));
                       if(decideformar ==1){
                           ator.setFormacao(true);
                       }
                       apresenta.setQtdApresenta(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Apresentações esse Ator fez?", "Cadastrando Ator",1)));
                       
                      int pontuacao=ator.CalculaPontuacao(apresenta.getQtdApresenta());
                      totpontuacao = Apresentacao.getPontuacaotot(pontuacao);
                      apresenta.setAtor(ator);
                       
                    }while (JOptionPane.showConfirmDialog(null,"Deseja cadastrar mais algum Ator?", "Terminando o cadastro de Ator", JOptionPane.YES_NO_CANCEL_OPTION)==0);
                   
                    
                    for (int i=0;i<apresenta.getAtores().size();i++){
                        System.out.println("                            Atores                        ");
                        System.out.println("Imprimindo nome do Ator: "+apresenta.getAtores().get(i).getNome()+"\nImprimindo o CPF do Ator "+apresenta.getAtores().get(i).getCpf()+"\nImprimindo o tempo de servico: "+apresenta.getAtores().get(i).getTempservico()+"\nImprimindo o ano de Nascimento: "+apresenta.getAtores().get(i).getAno()+"\nImprimindo a quantidade de pontos: "+apresenta.getAtores().get(i).CalculaPontuacao(apresenta.getQtdApresenta()));
                         if (totpontuacao>=1000){
                            System.out.println("Você ganhou uma apresentação grátis");
                        }
                    }
                    
                    
                    break;
                    
                    
                    
                    case "Danca":
                    do {
                       danca.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Dancarino", "Metendo Danca", 1));
                       danca.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o CPF do Dancarino", "Metendo Danca",1)));
                       danca.setTempservico(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Tempo de Servico do Dancarino", "Metendo Danca",1)));
                       danca.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Ano de Nascimento do Dancarino", "Metendo Danca",1)));
                       apresenta.setQtdApresenta(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Apresentações esse Dancarino fez?", "Metendo Danca",1)));
                       int pontuacao =danca.CalculaPontuacao(apresenta.getQtdApresenta());
                       totpontuacao = Apresentacao.getPontuacaotot(pontuacao);
                       apresenta.setDancarino(danca);
                       
                    }while (JOptionPane.showConfirmDialog(null,"Deseja cadastrar mais algum Dancarino?", "Terminando o cadastro de Dancarino", JOptionPane.YES_NO_CANCEL_OPTION)==0);
                    
                    for (int i=0;i<apresenta.getDancarinos().size();i++){
                        System.out.println("                            DANCARINOS                        ");
                        System.out.println("Imprimindo nome do dancarino: "+apresenta.getDancarinos().get(i).getNome()+"\nImprimindo o CPF do dancarino "+apresenta.getDancarinos().get(i).getCpf()+"\nImprimindo o tempo de servico: "+apresenta.getDancarinos().get(i).getTempservico()+"\nImprimindo o ano de Nascimento: "+apresenta.getDancarinos().get(i).getAno()+"\nImprimindo a quantidade de pontos"+apresenta.getDancarinos().get(i).CalculaPontuacao(apresenta.getQtdApresenta()));
                         if (totpontuacao>=1000){
                            System.out.println("Você ganhou uma apresentação grátis");
                        }   
                    
                    }
                    
                    
                    
                    
                    
                    break;
                case "Cantor":
                    do {
                       cantor.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Cantor", "Cadastrando Cantor", 1));
                       cantor.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o CPF do Cantor", "Cadastrando Cantor",1)));
                       cantor.setTempservico(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Tempo de Servico do Cantor", "Cadastrando Cantor",1)));
                       cantor.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Ano de Nascimento do Cantor", "Cadastrando Cantor",1)));
                       apresenta.setQtdApresenta(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Apresentações esse Cantor fez?", "Cadastrando Cantor",1)));
                       int componentesdabanda = Integer.parseInt(JOptionPane.showInputDialog(null, "Você possui mais algum integrante?","Cadastrando Cantor",JOptionPane.YES_NO_OPTION));
                       if(componentesdabanda ==1){
                       baixista.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do baixista", "Embaixo", 1));
                       baixista.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o CPF do baixista", "Embaixo",1)));
                       baixista.setTempservico(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Tempo de Servico do baixista", "Embaixo",1)));
                       baixista.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Ano de Nascimento do baixista", "Embaixo",1)));
                       
                       banda.setBaixista(baixista);
                       
                       baterista.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do baterista", "Bate forte o tambor", 1));
                       baterista.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o CPF do baterista", "Bate forte o tambor",1)));
                       baterista.setTempservico(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Tempo de Servico do baterista", "Bate forte o tambor",1)));
                       baterista.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Ano de Nascimento do baterista", "Bate forte o tambor",1)));
                       
                       banda.setBaterista(baterista);
                       
                       guitarrista.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do baterista", "Manda o sample", 1));
                       guitarrista.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o CPF do baterista", "Manda o sample",1)));
                       guitarrista.setTempservico(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Tempo de Servico do baterista", "Manda o sample",1)));
                       guitarrista.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Ano de Nascimento do baterista", "Manda o sample",1)));
                       
                       banda.setGuitarrista(guitarrista);
                       }
                       cantor.setBanda(banda);
                       
                       
                       int pontuacao =cantor.CalculaPontuacao(apresenta.getQtdApresenta());
                       totpontuacao = Apresentacao.getPontuacaotot(pontuacao);
                       apresenta.setCantor(cantor);
                       
                       
                    }while (JOptionPane.showConfirmDialog(null,"Deseja cadastrar mais algum Cantor?", "Terminando o cadastro de Cantor", JOptionPane.YES_NO_CANCEL_OPTION)==0);
                    
                    for (int i=0;i<apresenta.getCantores().size();i++){
                        System.out.println("                            DANCARINOS                        ");
                        System.out.println("Imprimindo nome do Cantores: "+apresenta.getCantores().get(i).getNome()+"\nImprimindo o CPF do Cantores "+apresenta.getCantores().get(i).getCpf()+"\nImprimindo o tempo de servico: "+apresenta.getCantores().get(i).getTempservico()+"\nImprimindo o ano de Nascimento: "+apresenta.getCantores().get(i).getAno()+"\nImprimindo a quantidade de pontos"+apresenta.getCantores().get(i).CalculaPontuacao(apresenta.getQtdApresenta()));
                        System.out.println("Imprimindo o nome do baixista: "+apresenta.getCantores().get(i).getBanda().getBaixista().getNome()+"\nImprimindo o CPF do baixista: "+apresenta.getCantores().get(i).getBanda().getBaixista().getCpf()+"\nImprimindo o ano do baixista: "+apresenta.getCantores().get(i).getBanda().getBaixista().getAno()+"\nImprimindo o tempo de serviço do baixista: "+apresenta.getCantores().get(i).getBanda().getBaixista().getTempservico()); 
                        System.out.println("Imprimindo o nome do baterista: "+apresenta.getCantores().get(i).getBanda().getBaterista().getNome()+"\nImprimindo o CPF do Baterista: "+apresenta.getCantores().get(i).getBanda().getBaterista().getCpf()+"\nImprimindo o ano do baterista: "+apresenta.getCantores().get(i).getBanda().getBaterista().getAno()+"\nImprimindo o tempo de serviço do Baterista: "+apresenta.getCantores().get(i).getBanda().getBaterista().getTempservico()); 
                        System.out.println("Imprimindo o nome do Guitarrista: "+apresenta.getCantores().get(i).getBanda().getGuitarrista().getNome()+"\nImprimindo o CPF do Guitarrista: "+apresenta.getCantores().get(i).getBanda().getGuitarrista().getCpf()+"\nImprimindo o ano do Guitarrista: "+apresenta.getCantores().get(i).getBanda().getGuitarrista().getAno()+"\nImprimindo o tempo de serviço do Guitarrista: "+apresenta.getCantores().get(i).getBanda().getGuitarrista().getTempservico()); 

                        if (totpontuacao>=1000){
                            System.out.println("Você ganhou uma apresentação grátis");
                        }
                    
                    }
                    
                    
                    
                    break;
            }
            
            
        }while(JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais algum artista?", "Teatrão da porra", JOptionPane.YES_NO_CANCEL_OPTION)==0);
        
         
        
    }
    
}
