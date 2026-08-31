package FundamentosJava;

public class ExecutaCalculadora {

    public static void main(String[] args) {
        int valorUm = 18;
        int valorDois = 2;
        int resultadoSoma;
        int resultadoMultiplicacao;
        int resultadoSubtracao;
        int resultadoDivisao;

        //Instanciando classe
        CalculadoraSimples calculo = new CalculadoraSimples(valorUm, valorDois);

        //Chamadas de métodos
        resultadoSoma = calculo.Soma(valorUm, valorDois);
        resultadoMultiplicacao = calculo.Multiplicacao(valorUm, valorDois);
        resultadoSubtracao = calculo.Subtracao(valorUm, valorDois);
        resultadoDivisao = calculo.Divisao(valorUm, valorDois);

        //Saídas
        System.out.println("-RESULTADO-");
        System.out.println(valorUm + " + " + valorDois + " = " + resultadoSoma);
        System.out.println(valorUm + " x " + valorDois + " = " + resultadoMultiplicacao);
        System.out.println(valorUm + " - " + valorDois + " = " + resultadoSubtracao);
        System.out.println(valorUm + " / " + valorDois + " = " + resultadoDivisao);
    }
}
