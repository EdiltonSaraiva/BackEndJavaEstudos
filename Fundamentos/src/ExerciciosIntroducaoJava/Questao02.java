package ExerciciosIntroducaoJava;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroUm, numeroDois;

        System.out.print("Digite o primeiro número:\t");
        numeroUm = entrada.nextInt();

        System.out.print("Digite o primeiro número:\t");
        numeroDois = entrada.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println("\nO primeiro número digitado: " + numeroUm + " é maior que o segundo número: " + numeroDois);
        } else if (numeroUm == numeroDois) {
            System.out.println("\nOs números são iguais.\nPrimeiro número: " + numeroUm + "\nSegundo número: " + numeroDois);
        } else {
            System.out.println("\nO segundo número digitado: " + numeroDois + " é maior que o primeiro número: " + numeroUm);
        }
    }
}
