package FundamentosJava;

public class ExecutaIntroducao {

    public static void main(String[] args) {
        //Instâncias
        IntroducaoJava java1 = new IntroducaoJava("Introdução à Java 1");
        IntroducaoJava java2 = new IntroducaoJava("Introdução à Java 2");
        IntroducaoJava meunome = new IntroducaoJava("Edilton Saraiva");

        //Saída
        System.out.println(java1.getConteudo());
        System.out.println(java2.getConteudo());
        System.out.println(meunome.getConteudo());
    }
}
