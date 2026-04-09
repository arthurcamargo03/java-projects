/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais
 */
package sequential_structure_exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, horas;
        double valor_hora;

        num = sc.nextInt();
        horas = sc.nextInt();
        valor_hora = sc.nextDouble();

        double salario =(valor_hora * horas);
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", num,salario);


    }


}
