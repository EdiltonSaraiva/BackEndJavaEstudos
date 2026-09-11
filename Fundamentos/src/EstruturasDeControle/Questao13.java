package EstruturasDeControle;

public class Questao13 {
    public static void main(String[] args) {
        System.out.println("\nContando de 10 até 1:");

        int numeroAtual = 10;

        while (numeroAtual > 0) {
            System.out.print(" -> " + numeroAtual);
            numeroAtual--;
        }
        System.out.println("\nContagem encerrada!\n");
    }
}
