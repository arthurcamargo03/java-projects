/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

 */


package sequential_structure_exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x;
        x = sc.nextDouble();
        Locale.setDefault(Locale.US);
        double area = 3.14159 * (Math.pow(x, 2));
        System.out.printf("A = %.4f", area);

    }
}
