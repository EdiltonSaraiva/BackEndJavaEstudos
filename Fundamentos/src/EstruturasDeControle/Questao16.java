package EstruturasDeControle;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {

        Scanner digitaNumero = new Scanner(System.in);

        System.out.print("Digite um número inteiro:\t");
        int numero = digitaNumero.nextInt();
        System.out.println("");

        int maiorNumero = numero;

        while (numero != 0) {
            System.out.print("Digite um número inteiro:\t");
            numero = digitaNumero.nextInt();
            System.out.println("");
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("Maior número digitado: " + maiorNumero);
    }
}
