package EstruturasDeControle;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner digitaNumero = new Scanner(System.in);

        System.out.print("Digite um número inteiro:\t");
        int numero = digitaNumero.nextInt();

        if (numero % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");

        }
    }

}

