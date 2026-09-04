package ExerciciosIntroducaoJava;

public class Questao01 {

    public static void main(String[] args) {

        //Valores dos dois itens
        double valorItemUm = 2.95;
        double valorItemDois = 3.50;
        final double taxaValor = 0.0825;

        System.out.println("\n-PRODUTOS E VALORES-");

        //Exibindo os valores
        System.out.println("- O Item 1 custa R$" + valorItemUm);
        System.out.println("- O Item 2 custa R$" + valorItemDois);

        //Calculando o custo total
        double custoTotal = valorItemUm + valorItemDois;
        System.out.println("- Custo total R$" + custoTotal + "\n");

        System.out.println("-TAXAS APLICADAS-");

       valorItemUm = valorItemUm / taxaValor;
       valorItemDois = valorItemDois / taxaValor;
       double novoCusto = valorItemUm + valorItemDois;

        System.out.println("- O Item 1 custa R$" + valorItemUm);
        System.out.println("- O Item 2 custa R$" + valorItemDois);
        System.out.println("- Custa final R$" + novoCusto);
    }
}
