package Questao6;

import java.util.Scanner;

public class questao6 {

    public static void main(String[] args) {

        Scanner expre = new Scanner(System.in);
        System.out.print("escreva os valores: \n");
        int A = expre.nextInt();
        int B = expre.nextInt();
        int C = expre.nextInt();

       float R =(A + B) * (A + B);
       float S =(B + C) * (B + C);
       float D =(R + S) / 2;

        System.out.print("o valor é: " + D);
    }
}