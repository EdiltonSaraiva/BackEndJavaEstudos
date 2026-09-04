package ExerciciosIntroducaoJava;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner digitaNumero = new Scanner(System.in);

        int numero;
        System.out.print("Digite um número inteiro:\t");
        numero = digitaNumero.nextInt();

        if (numero % 2 == 0) {
            System.out.println("\n- O número é PAR!");
        } else {
            System.out.println("\n- O número é ÍMPAR!");
        }
    }
}
