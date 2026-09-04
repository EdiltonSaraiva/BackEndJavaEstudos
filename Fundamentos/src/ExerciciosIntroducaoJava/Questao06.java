package ExerciciosIntroducaoJava;

import java.awt.*;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner digitaMes = new Scanner(System.in);
        int dia = 27;
        int mes;
        int ano = 2000;

        System.out.print("Digite o número de um mês do ano:\t");
        mes = digitaMes.nextInt();

        int numeroDias;
        String nomeMes = "";

        System.out.println(dia + "/" + mes + "/" + ano);

        switch (mes) {
            case 1:
                numeroDias = 31;
                nomeMes = "Janeiro";
                break;
            case 2:
                numeroDias = 28;
                nomeMes = "Fevereiro";
                break;
            case 3:
                numeroDias = 31;
                nomeMes = "Março";
                break;
            case 4:
                numeroDias = 30;
                nomeMes = "Abril";
                break;
            case 5:
                numeroDias = 31;
                nomeMes = "Maio";
                break;
            case 6:
                numeroDias = 30;
                nomeMes = "Junho";
                break;
            case 7:
                numeroDias = 31;
                nomeMes = "Julho";
                break;
            case 8:
                numeroDias = 31;
                nomeMes = "Agosto";
                break;
            case 9:
                numeroDias = 30;
                nomeMes = "Setembro";
                break;
            case 10:
                numeroDias = 31;
                nomeMes = "Outubro";
                break;
            case 11:
                numeroDias = 30;
                nomeMes = "Novembro";
                break;
            case 12:
                numeroDias = 31;
                nomeMes = "Dezembro";
                break;
            default:
                numeroDias = 0;
            }
        if (numeroDias == 0 && mes > 12) {
            System.out.println("O número digitado para mês do ano é invalido!");
        } else if (numeroDias != 0 && mes == 2){
            System.out.println("Desconsiderando ano bisexto o mês de " + nomeMes + " tem " +  numeroDias + " dias.");
        } else {
            System.out.println("O mês de " + nomeMes + " tem " + numeroDias);
        }
    }
}
