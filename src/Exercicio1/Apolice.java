package Exercicio1;

public class Apolice {

    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;
    
    public Apolice(){
    
    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double calculaValor() {
        double valorApolice=0;
        
        
        if (sexo == 'M' && idade <= 25) {
            return valorApolice = valorAutomovel * 10 / 100;
        }
        if (sexo == 'M' && idade > 25) {
            return valorApolice =  valorAutomovel * 5 / 100;
        }
        if (sexo == 'F') {
            return valorApolice = valorAutomovel * 2 / 100;
        }
        return valorApolice;
    }

    public String imprimir() {
        return "Numero: "+ getNumero()
                +"\nNome: "+ getNome()
                +"\nIdade: "+ getIdade()
                +"\nSexo: "+ getSexo()
                +"\nValor Automovel: "+ getValorAutomovel()
                +"\n------------------------------"
                +"\nValor Apolice: "
                +String.format("%.2f",calculaValor());
        
    }
}


