package FundamentosJava;

public class CalculadoraSimples {
    //Atributos
    private int ValorA, ValorB;

    //Construtor
    public CalculadoraSimples(int valor_a, int valor_b) {
        this.ValorA = valor_a;
        this.ValorB = valor_b;
    }

    //Metodos
    public int Soma(int valor_a, int valor_b) {
        int resultadoSoma = valor_a + valor_b;
        return resultadoSoma;
    }

    public int Multiplicacao(int valor_a, int valor_b) {
        int resultadoMultiplicacao = valor_a * valor_b;
        return resultadoMultiplicacao;
    }

    public int Subtracao(int valor_a, int valor_b) {
        int resultadoSubtracao = valor_a - valor_b;
        return resultadoSubtracao;
    }

    public int Divisao(int valor_a, int valor_b) {
        int resultadoDivisao = valor_a / valor_b;
        return  resultadoDivisao;
    }
}
