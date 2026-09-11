package EstruturasDeControle;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner digitaDia = new Scanner(System.in);

        System.out.print("\nDigite um número de 1 a 7:\t");
        int diaDaSemana = digitaDia.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
