package Questao1;

import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {

        Scanner multi = new Scanner(System.in);
        System.out.print("Escreva o primeiro número = ");
        int x = multi.nextInt();
        System.out.print("Escreva o segundo número =  ");
        int y = multi.nextInt();

        int result = x * y;

        System.out.println( x + "*" + y + " = " + result);
    }
}
