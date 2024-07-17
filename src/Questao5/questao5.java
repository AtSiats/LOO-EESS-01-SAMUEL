package Questao5;
import java.util.Scanner;

public class questao5 {

    public static void main(String[] args) {

        Scanner funci = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = funci.nextLine();
        System.out.print("Horas Trabalhadas: ");
        int horas = funci.nextInt();
        System.out.print("Dependentes: ");
        double depen = funci.nextDouble();

        double salario = 3 * horas ;
        double totaldepen = 100 * depen;
        double SalDen = salario + totaldepen;
        double desconto = (SalDen * 13.5) / 100;
        double SalLiq = SalDen - desconto ;

        System.out.printf(nome + "seu salario total e de: R$" + SalLiq);

    }
}
