package Questao3;

import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {

        Scanner dollar = new Scanner(System.in);
        System.out.print("Quanto está custando o dolar = ");
        double cot = dollar.nextDouble();
        System.out.print("EScreva um valor em dolares =  ");
        double val = dollar.nextDouble();

        double reais = cot * val;

        System.out.println("R$" + reais);
    }
}
