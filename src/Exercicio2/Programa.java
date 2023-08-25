package Exercicio2;

import javax.swing.JOptionPane;

public class Programa {

    public static void main(String[] args) {

        Vendedor vend = null;
        int opt = 0;
        double desconto;
        double valorVenda;
        String result = null;
        while (opt != 3) {
            opt = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1-Cadastrar vendedor\n2-Calcular venda\n3-Sair"));
            if (opt == 0) {
                System.exit(0);
            }
            switch (opt) {
                case 1:
                    int codigo = Integer.parseInt (JOptionPane.showInputDialog("Codigo: "));
                    String nome = JOptionPane.showInputDialog("Nome: ");
                    double percentualComissao = Double.parseDouble(JOptionPane.showInputDialog("Percentual Comissao: "));
                    vend = new Vendedor(codigo, nome, percentualComissao);
                    valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Valor da venda:"));
                    desconto = Double.parseDouble(JOptionPane.showInputDialog("Valor Desconto: "));
                    vend.calcularPagamentoComissao(valorVenda, desconto);
                    result = vend.imprimir(valorVenda, desconto);
                    break;
                case 2:
                    
                    if(vend == null){
                        JOptionPane.showMessageDialog(null,"ERRO!Necessario Cadastrar vendedor!","Alerta",JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,result);
                        
                   
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Ate logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Erro!Digite um Valor Valido","Erro!",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

}
