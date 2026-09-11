package EstruturasDeControle;

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {

        Scanner digitaNumero = new Scanner(System.in);

        int numeroDigitado;
        int quantidadeNegativo = 0;
        int quantidadePositvo = 0;
        int quantidadeZero = 0;

        for (int numero = 1; numero <=10; numero++) {
            System.out.print("Digite o " + numero + "º número inteiro:\t");
            numeroDigitado = digitaNumero.nextInt();

            if (numeroDigitado > 0) {
                quantidadePositvo++;
            } else if (numeroDigitado == 0) {
                quantidadeZero++;
            } else {
                quantidadeNegativo++;
            }
        }
        System.out.println("\nRelação dos núemeros:");
        System.out.println("Quantidade positivos: " + quantidadePositvo);
        System.out.println("Quantidade negativos: " + quantidadeNegativo);
        System.out.println("Quantidade zeros: " + quantidadeZero);
    }
}
