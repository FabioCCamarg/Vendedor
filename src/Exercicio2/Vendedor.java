
package Exercicio2;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public Vendedor(){
    
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double calcularPagamentoComissao(double valorVenda){
        return valorVenda *percentualComissao / 100;
    }
    public double calcularPagamentoComissao(double valorVenda, double desconto){
        return valorVenda - desconto;
        
    }
    public String imprimir(double valorVenda, double desconto){
       

        String resultado = String.format(
        "Código: %d\nNome: %s\nValor Venda: %.2f\n%% Comissão: %.2f\nValor a Pagar: %.2f",
        getCodigo(), getNome(), valorVenda, percentualComissao, calcularPagamentoComissao(valorVenda, desconto));

    return resultado;
                       
                
    }
}
