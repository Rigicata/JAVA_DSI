/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abreaportamariquinha;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class AbreAPortaMariquinha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String opcoes[] = {"CadastrarPorta", "CadastrarCasa", "CadastrarEdificio"};
        Casa casa = new Casa();
        Edificio edificio = new Edificio();
        Porta porta = new Porta();
        FabricaDeArray array = new FabricaDeArray();
        int i = 0, cont = 0;
        String marcaneta;
        do {

            String entrada = (String) JOptionPane.showInputDialog(null, "Escolha uma das opções", "O que tu queres há de ser tudo dentro da lei", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
            switch (entrada) {
                case "CadastrarPorta":
                    do {
                        marcaneta = JOptionPane.showInputDialog(null, "Você quer abrir ou fechar a porta?", entrada, 0);
                        if (marcaneta.equals("Fechar")) {
                            porta.Abre();
                        } else {
                            porta.Fecha();
                        }
                        porta.Pinta(JOptionPane.showInputDialog(null, "Qual a cor da porta?", "Você é artista pvte", 1));
                        porta.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a altura da porta", 1)));
                        porta.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a largura da porta", 1)));
                        porta.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a profundidade da porta", 1)));
                        array.CadastraPortas(porta);
                    } while (JOptionPane.showConfirmDialog(null, "Deseja realizar mais alguma ação?", "Vai fechar de vez?", JOptionPane.YES_NO_CANCEL_OPTION) == 0);

                    for (i = 0; i < array.getPortas().size(); i++) {
                        System.out.println(" PORTA NUMBER: " + (i + 1));
                        System.out.println("Imprimindo cor da porta: " + array.getPortas().get(i).getCorPorta() + "\nImprimindo o estado da porta: " + array.getPortas().get(i).estaAberta() + "\nImprimindo as dimensoes: " + array.getPortas().get(i).getDimensaoX() + "\nImprimindo as dimensoes: " + array.getPortas().get(i).getDimensaoZ() + "\nImprimindo as dimensoes: " + array.getPortas().get(i).getDimensaoY());

                    }
                    break;
                case "CadastrarCasa":
                    do {
                        String corcasa = JOptionPane.showInputDialog(null, "Qual a cor da casa? ", "Pinta com Luscolor", 1);
                        casa.cadastraCor(corcasa);

                        do {
                            porta.Pinta(JOptionPane.showInputDialog(null, "Qual a cor da porta?", "Você é artista pvte", 1));
                            porta.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a altura da porta", 1)));
                            porta.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a largura da porta", 1)));
                            porta.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a profundidade da porta", 1)));
                            cont++;
                            if (cont % 2 == 0) {
                                porta.Abre();
                            } else {
                                porta.Fecha();
                            }
                            casa.cadastraPorta(porta);
                        } while (JOptionPane.showConfirmDialog(null, "Deseja realizar mais alguma ação?", "Vai fechar de vez?", JOptionPane.YES_NO_CANCEL_OPTION) == 0);
                    } while (JOptionPane.showConfirmDialog(null, "Deseja realizar mais alguma ação?", "Quer criar mais uma casa?", JOptionPane.YES_NO_CANCEL_OPTION) == 0);
                    for (i = 0; i < casa.getPortas().size(); i++) {
                        System.out.println(" Casa NUMBER: " + (i + 1));
                        System.out.println("Imprimindo a cor da casa" + casa.getCorcasa().get(i) + "\nImprimindo cor da porta: " + casa.getPortas().get(i).getCorPorta() + "\nImprimindo o estado da porta: " + casa.getPortas().get(i).estaAberta() + "\nImprimindo as dimensoes: " + casa.getPortas().get(i).getDimensaoX() + "\nImprimindo as dimensoes: " + casa.getPortas().get(i).getDimensaoZ() + "\nImprimindo as dimensoes: " + casa.getPortas().get(i).getDimensaoY());
                        System.out.println("Imprimindo o total de portas abertas: " + casa.quantasPortasEstaoAbertas(cont) + "\nImprimindo o total de portas: " + casa.totalDePortas());
                    }
                    break;

                case "CadastrarEdificio":
                    do {
                        String coredificio = JOptionPane.showInputDialog(null, "Qual a cor do edifício? ", "Pinta com Luscolor", 1);
                        edificio.Pinta(coredificio);
                        do {
                            edificio.AdicionaAndar(JOptionPane.showInputDialog(null, "Qual o nome do andar?", "É difícil colocar o nome nos andares", 1));
                            do {
                                porta.Pinta(JOptionPane.showInputDialog(null, "Qual a cor da porta?", "Você é artista pvte", 1));
                                porta.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a altura da porta", 1)));
                                porta.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a largura da porta", 1)));
                                porta.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog(null, "Dimensões", "Qual a profundidade da porta", 1)));
                                marcaneta = JOptionPane.showInputDialog(null, "Você quer abrir ou fechar a porta?", entrada, 0);
                                if (marcaneta.equals("Fechar")) {
                                    porta.Abre();
                                } else {
                                    porta.Fecha();
                                }
                                edificio.CadastraPortas(porta);
                            } while (JOptionPane.showConfirmDialog(null, "Deseja realizar mais alguma ação?", "Quer criar mais um andar?", JOptionPane.YES_NO_CANCEL_OPTION) == 0);

                        } while (JOptionPane.showConfirmDialog(null, "Deseja realizar mais alguma ação?", "Quer criar mais um andar?", JOptionPane.YES_NO_CANCEL_OPTION) == 0);

                    } while (JOptionPane.showConfirmDialog(null, "Deseja realizar mais alguma ação?", "Quer criar mais um edificio?", JOptionPane.YES_NO_CANCEL_OPTION) == 0);

                    
                    for (i = 0; i < edificio.getPortas().size(); i++) {
                        System.out.println(" Edificil NUMBER: " + (i + 1));
                        System.out.println("Nome do Andar: "+edificio.getNomedosandares().get(i)+"Imprimindo a cor do edificio" + edificio.getCor()+ "\nImprimindo cor da porta: " + edificio.getPortas().get(i).getCorPorta() + "\nImprimindo o estado da porta: " + edificio.getPortas().get(i).estaAberta() + "\nImprimindo as dimensoes: " + edificio.getPortas().get(i).getDimensaoX() + "\nImprimindo as dimensoes: " + edificio.getPortas().get(i).getDimensaoZ() + "\nImprimindo as dimensoes: " + edificio.getPortas().get(i).getDimensaoY());
                        System.out.println("Imprimindo o total de portas abertas: " + edificio.quantasPortasEstaoAbertas() + "\nImprimindo o total de portas: " + edificio.totalDePortas()+"\nTotal dos Andares: "+edificio.totalDeAndares());
                    }
                    break;
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja realizar mais alguma ação?", "Vai fechar de vez?", JOptionPane.YES_NO_CANCEL_OPTION) == 0);

    }
}
