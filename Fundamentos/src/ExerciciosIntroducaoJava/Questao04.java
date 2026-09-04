package ExerciciosIntroducaoJava;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner digitaNumero = new Scanner(System.in);
        int numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco;

        System.out.print("\nDigite o 1° numero:\t");
        numeroUm = digitaNumero.nextInt();
        System.out.print("Digite o 2° numero:\t");
        numeroDois = digitaNumero.nextInt();
        System.out.print("Digite o 3° numero:\t");
        numeroTres = digitaNumero.nextInt();
        System.out.print("Digite o 4° numero:\t");
        numeroQuatro = digitaNumero.nextInt();
        System.out.print("Digite o 5° numero:\t");
        numeroCinco = digitaNumero.nextInt();

        System.out.println("\n-OS NÚMEROS DIGITADOS-");
        System.out.println("Primeiro: " + numeroUm + "\nSegundo: " + numeroDois + "\nTerceiro: " + numeroTres + "\nQuarto: " + numeroQuatro + "\nQuinto: " + numeroCinco);

        int menorInteiro = numeroUm;
        int maiorInteiro = numeroUm;

        if (numeroDois > maiorInteiro) {
            maiorInteiro = numeroDois;
        }
        if (numeroTres > maiorInteiro) {
            maiorInteiro = numeroTres;
        }
        if (numeroQuatro > maiorInteiro) {
            maiorInteiro = numeroQuatro;
        }
        if (numeroCinco > maiorInteiro) {
            maiorInteiro = numeroCinco;
        }

        if (numeroDois < menorInteiro) {
            menorInteiro = numeroDois;
        }
        if (numeroTres < menorInteiro) {
            menorInteiro = numeroTres;
        }
        if (numeroQuatro < menorInteiro) {
            menorInteiro = numeroQuatro;
        }
        if (numeroCinco < menorInteiro) {
            menorInteiro = numeroCinco;
        }

        System.out.println("Dos números digitados, o maior foi o número " + maiorInteiro + " e o menor foi o número " + menorInteiro);
    }
}
