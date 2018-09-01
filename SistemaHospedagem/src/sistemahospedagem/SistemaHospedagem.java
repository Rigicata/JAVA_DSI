/*
 1- Você foi convidado a desenvolver um sistema para uma empresa de turismo. 
Esta empresa oferece pacotes de viagens para vários lugares. 
Existem vários pacotes que esta empresa oferece, segue abaixo os tipos: Passagem, translado, hospedagem 
e passeios turísticos (1 ou mais) Passagem e hospedagem 
Apenas Passagem A passagem é composta por data de ida e volta, cidade de origem e de destino e valor. 
O translado é composto por distância, valor padrão, data de ida e volta.
A hospedagem é composta pelos dias da viagem, baseados no dia de ida e volta, o valor da diária e o valor total. 
O passeio turístico é composto por dia, horário, tempo total e valor, lembrando que o pacote pode envolver vários passeios turísticos, na hora, o usuário escolhe quantos ele vai querer e são adicionados ao total.
O valor final será calculado em cima do total das coisas que estão inclusas no pacote. 
Para conquistar mais cliente, o dono da empresa de turismo, oferta 1 passeio turístico grátis, caso ele 
compre o pacote completo (passagem, translado, hospedagem e pelo menos um passeio turístico (ganhando mais um). 
E também, em pacotes que tenham valor superior a 3000 reais, é ofertado 5% de desconto. 
O pacote pode ser vendido para mais de 1 pessoa (juntas), 
o cálculo será feito multiplicando o valor total do pacote à quantidade de pessoas, porém, por se tratar de hospedagem única, 
o valor será descontado 20% da hospedagem.


 

                                                             PENDENCIAS


Fazer outros métodos para calcular o valor total nas opções que não possuem hospedagem
 */

package sistemahospedagem;

import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class SistemaHospedagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Caso o cliente pegue um pacote completo, ele ganha um passeio turístico
        //Pacotes com valor superior a 3000 reais recebe desconto de 5%
        // O pacote pode ser vendido para mais de uma pessoa
        // O calculo da passagem será feito valortotal * qtdPessoa. Porém se a hospedagem for única, terá um desconto de 20% da hospedagem
        
        // Instanciando as classes
        Passagem passagem = new Passagem ();
        PasseioTuristico passeio = new PasseioTuristico();
        Hospedagem hospedagem = new Hospedagem();
        Translado translado = new Translado();
        VemArray array = new VemArray();
      
        
        //Variáveis utilizadas ao longo do sistema
        int dataida,datavolta,x,qtdPessoa;
        double valortotal;
        String [] pacotes = {"Pacotão tão tão","Passagem+Hospedagem+Passeio","Passagem+Hospedagem+Translado","Passagem+Hospedagem","Passagem+Passeio","Passagem+Translado","Somente Passagem"};
        String [] tipopassagem = {"Economico","Classe A"};
        
   
        
            do {
             String enter = (String) JOptionPane.showInputDialog(null,"Escolha como quer viajar", "Escolha uma das opções abaixo",JOptionPane.QUESTION_MESSAGE, null, pacotes,pacotes[0]);
             switch(enter){
                 case "Pacotão tão tão":
                     //Pegando os valores
                   passagem.setCidadedestino(JOptionPane.showInputDialog(null,"Digite a cidade destino","Informações da passagem",1));
                   passagem.setCidadeorigem(JOptionPane.showInputDialog(null,"Digite a cidade de origem","Informações da passagem",1));
                   dataida = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da ida", "Informações da passagem",1));
                   passagem.setDataida(dataida);
                   datavolta = Integer.parseInt(JOptionPane.showInputDialog(null ,"Digite o dia da volta","Informações da passagem",1));
                   passagem.setDatavolta(datavolta);
                   passagem.CalculaValorPassagem((String) JOptionPane.showInputDialog(null,"Escolha o tipo de classe que você quer","Informações da passagem",JOptionPane.QUESTION_MESSAGE,null,tipopassagem,tipopassagem[0]));
                   passagem.setCodigoviagem(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da sua passagem(1 - Para regiões Norte - Nordeste ou 2 - Para resto do Brasil)", "Informações da passagem",1)));
                   hospedagem.setDiasviagem(passagem);
                   translado.setDataida(passagem);
                   translado.setDatavolta(passagem);
                   translado.setDistancia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a distancia", "Informações do translado",1)));
                   while (JOptionPane.showConfirmDialog(null, "Vou levar para dar um passeio", "Deseja algum passeio ? ",JOptionPane.YES_NO_CANCEL_OPTION)==0){
                      passeio.setDia(JOptionPane.showInputDialog(null, "Digite o dia do passeio ","Informações do Passeio Turistico",1));
                      passeio.setHorario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário","Informações do Passeio Turistico",1)));
                      passeio.setTempotot(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quanto tempo você quer ficar rodando?(Entre 1 e 2 horas)","Informações do Passeio Turistico",1)));
                      passeio.CalculaValorPasseio(translado);
                      passeio.CadastraPasseio(passeio);   
                   }
                   qtdPessoa = Integer.parseInt(JOptionPane.showInputDialog(null,"São quantas pessoas?","Informações Gerais",1));
                   valortotal = passeio.getValor()+hospedagem.getValordiaria()+translado.getValorpadrao()+passagem.getValor();
                  
                   
                   
                   //Impressão dos valores
                   
                     System.out.println(                                                    "                            INFORMAÇÕES DE CADASTRO                    "                                      );
                     System.out.println("\n\n");
                     System.out.println("Imprimindo data ida:"+passagem.getDataida()+"\nImprimindo a data volta:"+passagem.getDatavolta()+"\nImprimindo a cidade destino: "+passagem.getCidadedestino()+"\nImprimindo a cidade origem:"+passagem.getCidadeorigem()+"\nImprimindo o valor: "+passagem.getValor()+"\nImprimindo a região da viagem: "+passagem.getCodigoviagem()+"\nA quantidade de pessoas é: "+qtdPessoa);
                     System.out.println("\n\n");
                     System.out.println("Imprimindo os dias da hospedagem: "+hospedagem.getDiasviagem()+"\nImprimindo o valor da diária: "+hospedagem.getValordiaria());
                     System.out.println("\n\n");
                     System.out.println("Imprimindo o dia de ida do translado: "+translado.getDataida()+"\nImprimindo o dia de volta do translado: "+translado.getDatavolta()+"\nImprimindo o valor do translado: "+translado.getValorpadrao()+"\nImprimindo a distância"+translado.getDistancia());
                     System.out.println("\n\n");
                     System.out.println("Você possui um passeio grátis. Consulte nossa empresa para saber por onde os caminhos te levarão");
                     System.out.println("\n\n");
                     if(passeio.getPasseios().size()>=1){
                          for(int i =0;i<passeio.getPasseios().size();i++){
                              System.out.println(                                     "       INFORMAÇÕES DO PASSEIO        "                                 );
                              System.out.println("\n\n");
                              System.out.println("Imprimindo o dia do passeio:"+passeio.getPasseios().get(i).getDia()+"\nImprimindo o horário do passeio: "+passeio.getPasseios().get(i).getHorario()+"\nImprimindo o tempo total do passeio: "+passeio.getPasseios().get(i).getTempotot()+"Imprimindo o valor do passeio: "+passeio.getPasseios().get(i).getValor());
                     }
                     } else {
                         System.out.println("Você não pegou mais nenhum passeio");
                     }
                    
                     System.out.println("\n\n");
                     System.out.println("O valor total a pagar é: "+ passagem.CalculaValorTot(valortotal,qtdPessoa));
                   break;
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                 case "Passagem+Hospedagem+Translado":
                     //Pegando os valores
                   passagem.setCidadedestino(JOptionPane.showInputDialog(null,"Digite a cidade destino", "Informações da passagem",1));
                   passagem.setCidadeorigem(JOptionPane.showInputDialog(null,"Digite a cidade de origem", "Informações da passagem",1));
                   dataida = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da ida", "Informações da passagem",1));
                   passagem.setDataida(dataida);
                   datavolta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da volta", "Informações da passagem",1));
                   passagem.setDatavolta(datavolta);
                   passagem.CalculaValorPassagem((String) JOptionPane.showInputDialog(null,"Escolha o tipo de classe que você quer", "Informações da passagem",JOptionPane.QUESTION_MESSAGE,null,tipopassagem,tipopassagem[0]));
                   passagem.setCodigoviagem(Integer.parseInt(JOptionPane.showInputDialog(null, "Informações da passagem", "Digite o código da sua passagem(1 - Para regiões Norte - Nordeste ou 2 - Para resto do Brasil)",1)));
                   hospedagem.setDiasviagem(passagem);
                   translado.setDataida(passagem);
                   translado.setDatavolta(passagem);
                   translado.setDistancia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a distancia", "Informações do translado",1)));
                   qtdPessoa = Integer.parseInt(JOptionPane.showInputDialog(null,"São quantas pessoas?","Informações Gerais",1));
                   valortotal = hospedagem.getValordiaria()+translado.getValorpadrao()+passagem.getValor();

                   
                   
                   
                   //Imprimindo os valores
                   System.out.println(                                                    "INFORMAÇÕES DE CADASTRO"                                      );
                     System.out.println("\n\n");
                     System.out.println("Imprimindo data ida:"+passagem.getDataida()+"\nImprimindo a data volta:"+passagem.getDatavolta()+"\nImprimindo a cidade destino: "+passagem.getCidadedestino()+"\nImprimindo a cidade origem:"+passagem.getCidadeorigem()+"\nImprimindo o valor: "+passagem.getValor()+"\nImprimindo a região da viagem: "+passagem.getCodigoviagem()+"\nA quantidade de pessoas é: "+qtdPessoa);
                     System.out.println("\n\n");
                     System.out.println("Imprimindo os dias da hospedagem: "+hospedagem.getDiasviagem()+"\nImprimindo o valor da diária: "+hospedagem.getValordiaria());
                     System.out.println("\n\n");
                     System.out.println("Imprimindo o dia de ida do translado: "+translado.getDataida()+"\nImprimindo o dia de volta do translado: "+translado.getDatavolta()+"\nImprimindo o valor do translado: "+translado.getValorpadrao()+"\nImprimindo a distância"+translado.getDistancia());
                     System.out.println("\n\n");
                     System.out.println("O valor total a pagar é: "+passagem.CalculaValorTot(valortotal, qtdPessoa));
                   break;
                   
                   
                   
                   
                   
                   
                   
                 case "Passagem+Hospedagem+Passeio":
                     //Pegando os valores
                   passagem.setCidadedestino(JOptionPane.showInputDialog(null,"Digite a cidade destino", "Informações da passagem",1));
                   passagem.setCidadeorigem(JOptionPane.showInputDialog(null,"Digite a cidade de origem", "Informações da passagem",1));
                   dataida = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da ida", "Informações da passagem",1));
                   passagem.setDataida(dataida);
                   datavolta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da volta", "Informações da passagem",1));
                   passagem.setDatavolta(datavolta);
                   passagem.CalculaValorPassagem((String) JOptionPane.showInputDialog(null,"Escolha o tipo de classe que você quer", "Informações da passagem",JOptionPane.QUESTION_MESSAGE,null,tipopassagem,tipopassagem[0]));
                   passagem.setCodigoviagem(Integer.parseInt(JOptionPane.showInputDialog(null, "Informações da passagem", "Digite o código da sua passagem(1 - Para regiões Norte - Nordeste ou 2 - Para resto do Brasil)",1)));
                   hospedagem.setDiasviagem(passagem);
         
                   while (JOptionPane.showConfirmDialog(null, "Vou levar para dar um passeio", "Deseja algum passeio ? ",JOptionPane.YES_NO_CANCEL_OPTION)==0){
                      passeio.setDia(JOptionPane.showInputDialog(null, "Digite o dia do passeio ","Informações do Passeio Turistico",1));
                      passeio.setHorario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário","Informações do Passeio Turistico",1)));
                      passeio.setTempotot(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quanto tempo você quer ficar rodando?(Entre 1 e 2 horas)","Informações do Passeio Turistico",1)));
                      passeio.CalculaValorPasseio(translado);
                      passeio.CadastraPasseio(passeio);   
                   }
                   qtdPessoa = Integer.parseInt(JOptionPane.showInputDialog(null,"São quantas pessoas?","Informações Gerais",1));
                   valortotal = passeio.getValor()+hospedagem.getValordiaria()+passagem.getValor();

                   
                   
                   
                   
                   //Imprimindo os valores
                   
                   System.out.println(                                                    "INFORMAÇÕES DE CADASTRO"                                      );
                     System.out.println("\n\n");
                     System.out.println("Imprimindo data ida:"+passagem.getDataida()+"\nImprimindo a data volta:"+passagem.getDatavolta()+"\nImprimindo a cidade destino: "+passagem.getCidadedestino()+"\nImprimindo a cidade origem:"+passagem.getCidadeorigem()+"\nImprimindo o valor: "+passagem.getValor()+"\nImprimindo a região da viagem: "+passagem.getCodigoviagem()+"\nA quantidade de pessoas é: "+qtdPessoa);
                     System.out.println("\n\n");
                     System.out.println("Imprimindo os dias da hospedagem: "+hospedagem.getDiasviagem()+"\nImprimindo o valor da diária: "+hospedagem.getValordiaria());
                     System.out.println("\n\n");
                    if(passeio.getPasseios().size()>=1){
                          for(int i =0;i<passeio.getPasseios().size();i++){
                              System.out.println(                                     "       INFORMAÇÕES DO PASSEIO        "                                 );
                              System.out.println("\n\n");
                              System.out.println("Imprimindo o dia do passeio:"+passeio.getPasseios().get(i).getDia()+"\nImprimindo o horário do passeio: "+passeio.getPasseios().get(i).getHorario()+"\nImprimindo o tempo total do passeio: "+passeio.getPasseios().get(i).getTempotot()+"Imprimindo o valor do passeio: "+passeio.getPasseios().get(i).getValor());
                     }
                     } else {
                         System.out.println("Você não pegou mais nenhum passeio");
                     }
                    
                     System.out.println("\n\n");
                     System.out.println("O valor total a pagar é: "+passagem.CalculaValorTot(valortotal, qtdPessoa));
                   
                   
                   
                   
                   break;
                   
                   
                   
                   
                   
                   
                   
                   
                   
                 case "Passagem+Hospedagem":
                     //Pegando os valores
                   passagem.setCidadedestino(JOptionPane.showInputDialog(null,"Digite a cidade destino", "Informações da passagem",1));
                   passagem.setCidadeorigem(JOptionPane.showInputDialog(null,"Digite a cidade de origem", "Informações da passagem",1));
                   dataida = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da ida", "Informações da passagem",1));
                   passagem.setDataida(dataida);
                   datavolta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da volta", "Informações da passagem",1));
                   passagem.setDatavolta(datavolta);
                   passagem.CalculaValorPassagem((String) JOptionPane.showInputDialog(null,"Escolha o tipo de classe que você quer", "Informações da passagem",JOptionPane.QUESTION_MESSAGE,null,tipopassagem,tipopassagem[0]));
                   passagem.setCodigoviagem(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da sua passagem(1 - Para regiões Norte - Nordeste ou 2 - Para resto do Brasil)", "Informações da passagem",1)));
                   hospedagem.setDiasviagem(passagem);
                   
                   qtdPessoa = Integer.parseInt(JOptionPane.showInputDialog(null,"São quantas pessoas?","Informações Gerais",1));
                   valortotal = hospedagem.getValordiaria()+passagem.getValor();

                   
                   
                   //Imprimindo os valores
                   
                    System.out.println(                                                    "INFORMAÇÕES DE CADASTRO"                                      );
                     System.out.println("\n\n");
                     System.out.println("Imprimindo data ida:"+passagem.getDataida()+"\nImprimindo a data volta:"+passagem.getDatavolta()+"\nImprimindo a cidade destino: "+passagem.getCidadedestino()+"\nImprimindo a cidade origem:"+passagem.getCidadeorigem()+"\nImprimindo o valor: "+passagem.getValor()+"\nImprimindo a região da viagem: "+passagem.getCodigoviagem()+"\nA quantidade de pessoas é: "+qtdPessoa);
                     System.out.println("\n\n");
                     System.out.println("Imprimindo os dias da hospedagem: "+hospedagem.getDiasviagem()+"\nImprimindo o valor da diária: "+hospedagem.getValordiaria());
                     System.out.println("\n\n");
                     System.out.println("O valor total a pagar é: "+passagem.CalculaValorTot(valortotal, qtdPessoa));
                   
                   
                   
                   
                   
                   break;
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                 case "Passagem+Translado":
                     
                     //Pegando os valores
                   passagem.setCidadedestino(JOptionPane.showInputDialog(null,"Digite a cidade destino", "Informações da passagem",1));
                   passagem.setCidadeorigem(JOptionPane.showInputDialog(null,"Digite a cidade de origem", "Informações da passagem",1));
                   dataida = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da ida", "Informações da passagem",1));
                   passagem.setDataida(dataida);
                   datavolta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da volta", "Informações da passagem",1));
                   passagem.setDatavolta(datavolta);
                   passagem.CalculaValorPassagem((String) JOptionPane.showInputDialog(null,"Escolha o tipo de classe que você quer", "Informações da passagem",JOptionPane.QUESTION_MESSAGE,null,tipopassagem,tipopassagem[0]));
                   passagem.setCodigoviagem(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da sua passagem(1 - Para regiões Norte - Nordeste ou 2 - Para resto do Brasil)", "Informações da passagem",1)));
                   translado.setDataida(passagem);
                   translado.setDatavolta(passagem);
                   translado.setDistancia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a distancia", "Informações do translado",1)));
                   qtdPessoa = Integer.parseInt(JOptionPane.showInputDialog(null,"São quantas pessoas?","Informações Gerais",1));
                   valortotal = translado.getValorpadrao()+passagem.getValor();

                   
                   //Imprimindo os valores
                     System.out.println(                                                    "INFORMAÇÕES DE CADASTRO"                                      );
                     System.out.println("\n\n");
                     System.out.println("Imprimindo data ida:"+passagem.getDataida()+"\nImprimindo a data volta:"+passagem.getDatavolta()+"\nImprimindo a cidade destino: "+passagem.getCidadedestino()+"\nImprimindo a cidade origem:"+passagem.getCidadeorigem()+"\nImprimindo o valor: "+passagem.getValor()+"\nImprimindo a região da viagem: "+passagem.getCodigoviagem()+"\nA quantidade de pessoas é: "+qtdPessoa);
                     System.out.println("\n\n");
                     System.out.println("Imprimindo o dia de ida do translado: "+translado.getDataida()+"\nImprimindo o dia de volta do translado: "+translado.getDatavolta()+"\nImprimindo o valor do translado: "+translado.getValorpadrao()+"\nImprimindo a distância"+translado.getDistancia());
                     System.out.println("\n\n");
                     System.out.println("\n\n");
                     System.out.println("O valor total a pagar é: "+passagem.CalculaValorTot(valortotal, qtdPessoa));
                   
                   break;
                   
                   
                   
                   
                   
                   
                 case "Passagem+Passeio":
                     //Pegando os valores
                   passagem.setCidadedestino(JOptionPane.showInputDialog(null,"Digite a cidade destino", "Informações da passagem",1));
                   passagem.setCidadeorigem(JOptionPane.showInputDialog(null,"Digite a cidade de origem", "Informações da passagem",1));
                   dataida = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da ida", "Informações da passagem",1));
                   passagem.setDataida(dataida);
                   datavolta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da volta", "Informações da passagem",1));
                   passagem.setDatavolta(datavolta);
                   passagem.CalculaValorPassagem((String) JOptionPane.showInputDialog(null,"Escolha o tipo de classe que você quer", "Informações da passagem",JOptionPane.QUESTION_MESSAGE,null,tipopassagem,tipopassagem[0]));
                   passagem.setCodigoviagem(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da sua passagem(1 - Para regiões Norte - Nordeste ou 2 - Para resto do Brasil)", "Informações da passagem",1)));
                    while (JOptionPane.showConfirmDialog(null, "Vou levar para dar um passeio", "Deseja algum passeio ? ",JOptionPane.YES_NO_CANCEL_OPTION)==0){
                      passeio.setDia(JOptionPane.showInputDialog(null, "Digite o dia do passeio ","Informações do Passeio Turistico",1));
                      passeio.setHorario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o horário","Informações do Passeio Turistico",1)));
                      passeio.setTempotot(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quanto tempo você quer ficar rodando?(Entre 1 e 2 horas)","Informações do Passeio Turistico",1)));
                      passeio.CalculaValorPasseio(translado);
                      passeio.CadastraPasseio(passeio);   
                   }
                   qtdPessoa = Integer.parseInt(JOptionPane.showInputDialog(null,"São quantas pessoas?","Informações Gerais",1));
                   valortotal = passeio.getValor()+passagem.getValor();

                   
                   
                   //Imprimindo os valores
                   
                     System.out.println(                                                    "INFORMAÇÕES DE CADASTRO"                                      );
                     System.out.println("\n\n");
                     System.out.println("Imprimindo data ida:"+passagem.getDataida()+"\nImprimindo a data volta:"+passagem.getDatavolta()+"\nImprimindo a cidade destino: "+passagem.getCidadedestino()+"\nImprimindo a cidade origem:"+passagem.getCidadeorigem()+"\nImprimindo o valor: "+passagem.getValor()+"\nImprimindo a região da viagem: "+passagem.getCodigoviagem()+"\nA quantidade de pessoas é: "+qtdPessoa);
                     System.out.println("\n\n");
                     if(passeio.getPasseios().size()>=1){
                          for(int i =0;i<passeio.getPasseios().size();i++){
                              System.out.println(                                     "       INFORMAÇÕES DO PASSEIO        "                                 );
                              System.out.println("\n\n");
                              System.out.println("Imprimindo o dia do passeio:"+passeio.getPasseios().get(i).getDia()+"\nImprimindo o horário do passeio: "+passeio.getPasseios().get(i).getHorario()+"\nImprimindo o tempo total do passeio: "+passeio.getPasseios().get(i).getTempotot()+"Imprimindo o valor do passeio: "+passeio.getPasseios().get(i).getValor());
                     }
                     } else {
                         System.out.println("Você não pegou mais nenhum passeio");
                     }
                    
                     System.out.println("\n\n");
                     System.out.println("O valor total a pagar é: "+passagem.CalculaValorTot(valortotal, qtdPessoa));
                     
                     
                   break;
                   
                   
                   
                   
                   
                   
                   
                 default:
                     //Pegando os valores
                   passagem.setCidadedestino(JOptionPane.showInputDialog(null,"Digite a cidade destino", "Informações da passagem",1));
                   passagem.setCidadeorigem(JOptionPane.showInputDialog(null,"Digite a cidade de origem", "Informações da passagem",1));
                   dataida = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da ida", "Informações da passagem",1));
                   passagem.setDataida(dataida);
                   datavolta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o dia da volta", "Informações da passagem",1));
                   passagem.setDatavolta(datavolta);
                   passagem.CalculaValorPassagem((String) JOptionPane.showInputDialog(null,"Escolha o tipo de classe que você quer", "Informações da passagem",JOptionPane.QUESTION_MESSAGE,null,tipopassagem,tipopassagem[0]));
                   passagem.setCodigoviagem(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da sua passagem(1 - Para regiões Norte - Nordeste ou 2 - Para resto do Brasil)", "Informações da passagem",1)));
                   qtdPessoa = Integer.parseInt(JOptionPane.showInputDialog(null,"São quantas pessoas?","Informações Gerais",1));
                   valortotal =passagem.getValor();

                   
                   //Imprimindo os valores
                   
                   System.out.println(                                                    "INFORMAÇÕES DE CADASTRO"                                      );
                     System.out.println("\n\n");
                     System.out.println("Imprimindo data ida:"+passagem.getDataida()+"\nImprimindo a data volta:"+passagem.getDatavolta()+"\nImprimindo a cidade destino: "+passagem.getCidadedestino()+"\nImprimindo a cidade origem:"+passagem.getCidadeorigem()+"\nImprimindo o valor: "+passagem.getValor()+"\nImprimindo a região da viagem: "+passagem.getCodigoviagem()+"\nA quantidade de pessoas é: "+qtdPessoa);
                     System.out.println("O valor total a pagar é: "+passagem.CalculaValorTot(valortotal, qtdPessoa));
                   break;
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                 
             }
            }while(JOptionPane.showConfirmDialog(null, " Deseja comprar mais alguma coisa ?", "Quer comprar ?", JOptionPane.YES_NO_OPTION) == 0);
        
            
        }
        
        
        
    

    
    
    
    
    
    
    }
    

