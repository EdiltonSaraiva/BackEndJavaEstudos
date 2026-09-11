package EstruturasDeControle;

public class Questao10 {
    public static void main(String[] args) {

        System.out.println("Números ímpares entre 1 e 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}