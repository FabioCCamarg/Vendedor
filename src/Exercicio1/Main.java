package Exercicio1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Apolice apolice = null;
        int opt= 0;

        
        while (opt != 3) {
            opt = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1-Criar Apolice\n2-Ver Dados Apolíce\n3-Sair"));
            if(opt == 0){
                System.exit(0);
            }
            switch (opt) {
                case 1:
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
                    String nome = JOptionPane.showInputDialog("Nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
                    char sexo = JOptionPane.showInputDialog("Sexo: ").charAt(0);
                    double valorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Valor do Automovel"));
                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);

                    break;
                case 2:
                    if (apolice == null) {
                        JOptionPane.showMessageDialog(null, "Erro, sem dados!", "Alerta Vermelho!!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, apolice.imprimir());
                        
                    }
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Até Logo!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Ops, Algo deu errado!", "Cuidado", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

}
