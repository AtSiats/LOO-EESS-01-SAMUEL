package Questao4;
import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {

        Scanner Media = new Scanner(System.in);
        System.out.print("qual o valor da sua primeira nota = ");
        float NotaUm = Media.nextFloat();
        System.out.print("Valor da segunda nota =  ");
        float NotaDois = Media.nextFloat();
        System.out.print("valor da Terceira nota = ");
        float NotaTres = Media.nextFloat();

        float mediaUm = NotaUm * 2;
        float mediaDois = NotaDois * 3;
        float mediaTres = NotaTres * 5;
        float MediaFinal = (mediaUm + mediaDois + mediaTres)/ (2 + 3 + 5) ;
        System.out.println("Sua media Final é: " + MediaFinal);
    }
}
