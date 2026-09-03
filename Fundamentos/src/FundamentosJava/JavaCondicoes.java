package FundamentosJava;

public class  JavaCondicoes {

    public static void main(String[] args) {

        //Valores dos dois itens
        double valorItemUm = 2.95;
        double valorItemDois = 3.50;

        //Exibindo os valores
        System.out.println("O Item 1 custa" + valorItemUm);
        System.out.println("O Item 2 custa" + valorItemDois + "\n");

        //Calculando o custo total
        double custoTotal = valorItemUm + valorItemDois;

        System.out.println("Custo total:" + custoTotal + "\n");

        //Comparando valores
        if (valorItemUm > valorItemDois) {
            System.out.println("O Item 1 que custa " + valorItemUm + " é maior que o Item 2 que custa " + valorItemDois);
        } else if (valorItemUm == valorItemDois) {
            System.out.println("Os valores do Item 1 e 2 são iguais, custando " + valorItemUm + " e " + valorItemDois);
        } else {
            System.out.println("O item 2 que custa " + valorItemDois + " é maior que o Item 1 que custa " + valorItemUm);
        }
    }
}
