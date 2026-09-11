package EstruturasDeControle;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {

        Scanner digitaNota = new Scanner(System.in);

        int notaUm;
        int notaDois;
        int quantidadeAprovados = 0;
        int quantidadeReprovados = 0;
        int quantidadeRecuperacao = 0;

        for (int alunoIndice = 1; alunoIndice <= 5; alunoIndice++) {

            System.out.print("Digite a primeira nota do aluno " + alunoIndice + ":\t");
            notaUm = digitaNota.nextInt();
            System.out.print("\nDigite a segunda nota do aluno " + alunoIndice + ":\t");
            notaDois = digitaNota.nextInt();
            System.out.println();

            if ((notaUm + notaDois) / 2 >= 7) {
                quantidadeAprovados++;
            } else if ((notaUm + notaDois) / 2 >=5 && (notaUm + notaDois) / 2 < 7) {
                quantidadeRecuperacao++;
            } else {
                quantidadeReprovados++;
            }
        }
        System.out.println("Relação dos alunos:");
        System.out.println("Alunos aprovados: " + quantidadeAprovados);
        System.out.println("Alunos em recuperação: " + quantidadeRecuperacao);
        System.out.println("Alunos reprovados: " + quantidadeReprovados);
    }
}
