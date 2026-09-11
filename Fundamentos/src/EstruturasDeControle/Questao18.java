package EstruturasDeControle;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {

        int nota;

        do {
            Scanner digitaNota = new Scanner(System.in);
            System.out.print("Digite a nota:\t");
            nota = digitaNota.nextInt();
        } while (nota < 0 || nota > 10);
        System.out.println("\nNota registrada!");
    }
}
