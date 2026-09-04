package ExerciciosIntroducaoJava;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner digitaNumero = new Scanner(System.in);
        int numeroUm, numeroDois, numeroTres;

        System.out.print("\nDigite o primeiro número:\t");
        numeroUm = digitaNumero.nextInt();
        System.out.print("Digite o segundo número:\t");
        numeroDois = digitaNumero.nextInt();
        System.out.print("Digite o terceiro número:\t");
        numeroTres = digitaNumero.nextInt();

        int somaNumeros = numeroUm + numeroDois + numeroTres;
        int mediaNumeros = (numeroUm + numeroDois + numeroTres) / 3;
        int produtoNumeros = numeroUm * numeroDois * numeroTres;

        System.out.println("\nSoma dos números -> " + numeroUm + " + " + numeroDois + " + " + numeroTres + " = " + somaNumeros);
        System.out.println("Média dos números -> " + mediaNumeros);
        System.out.println("Produto dos  números -> " + numeroUm + " x " + numeroDois + " x " + numeroTres + " = " + produtoNumeros);

        if (numeroUm > numeroDois && numeroUm > numeroTres) {
            System.out.println("O primeiro número: " + numeroUm + " é o maior números dos três digitados.");
        } else if (numeroDois > numeroUm && numeroDois > numeroTres) {
            System.out.println("O numero número: " + numeroDois + " é o maior números dos três digitados.");
        } else if (numeroTres > numeroUm && numeroTres > numeroDois) {
            System.out.println("O terceiro número: " + numeroTres + " é o maior números dos três digitados.");
        } else if (numeroTres == numeroDois && numeroUm == numeroTres && numeroDois == numeroDois) {
            System.out.println("Os números digitais são todos iguais.");
        }
        else {
            System.out.println("ERRO, tente novamente.");
        }
    }
}
