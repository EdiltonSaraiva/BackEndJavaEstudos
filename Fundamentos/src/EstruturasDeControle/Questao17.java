package EstruturasDeControle;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {

        Scanner digitaOpcao = new Scanner(System.in);

        System.out.println("MENU DE OPÇÕES:");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Excluir");
        System.out.println("0 - Sair");

        int opcaoEscolhida;

        do {
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Sair\n");

            System.out.print("Digite uma opção:\t");
            opcaoEscolhida = digitaOpcao.nextInt();
        } while (opcaoEscolhida != 0);
    }

}
