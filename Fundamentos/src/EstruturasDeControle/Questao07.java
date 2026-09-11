package EstruturasDeControle;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner digitaNumero = new Scanner(System.in);

        System.out.print("Digite o primeiro número:\t");
        int primeiroNumero = digitaNumero.nextInt();

        System.out.print("Digite o segundo número:\t");
        int segundoNumero = digitaNumero.nextInt();

        System.out.println("\nOperações:");
        System.out.println("Digite 1 para ADIÇÃO +");
        System.out.println("Digite 2 para SUBTRAÇÃO -");
        System.out.println("Digite 3 para MULTIPLICAÇÃO *");
        System.out.println("Digite 4 para DIVISÃO /\n");

        System.out.print("Numero da operação:\t");
        int escolheOperacao = digitaNumero.nextInt();

        int resultado = 0;

        switch (escolheOperacao) {
            case 1:
                System.out.println("- Escolheu ADIÇÃO");
                resultado = primeiroNumero + segundoNumero;
                System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultado);
                break;
            case 2:
                System.out.println("Escolheu SUBTRAÇÃO");
                resultado = primeiroNumero - segundoNumero;
                System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultado);
                break;
            case 3:
                System.out.println("Escolheu MULTIPLICAÇÃO");
                resultado = primeiroNumero * segundoNumero;
                System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultado);
                break;
            case 4:
                System.out.println("Escolheu DIVISÃO");
                if (segundoNumero == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    break;
                }
                resultado = primeiroNumero / segundoNumero;
                System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultado);
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
    }
}