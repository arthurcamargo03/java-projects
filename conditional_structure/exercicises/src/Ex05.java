/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

*/

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double cod,qnt;
        System.out.println("Digite o código do produto: ");
        cod = sc.nextDouble();
        System.out.println("Digite a quantidade do produto");
        qnt = sc.nextDouble();
        if (cod == 1){
            double total = 4.0 * qnt;
            System.out.printf("Total = %.2f", total);
        }
        else if (cod == 2){
            double total = 4.50 * qnt;
            System.out.printf("Total = %.2f", total);
        }
        else if (cod == 3){
            double total = 5.0 * qnt;
            System.out.printf("Total = %.2f", total);
        }
        else if (cod == 4){
            double total = 2.0 * qnt;
            System.out.printf("Total = %.2f", total);
        }
        else if (cod == 5){
            double total = 1.50 * qnt;
            System.out.printf("Total = %.2f", total);
        }



    }
}
