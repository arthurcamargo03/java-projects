/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 */

package sequential_structure_exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod_1,num_1,cod_2,num_2;
        double valor_1,valor_2;

        cod_1 = sc.nextInt();
        num_1 = sc.nextInt();
        valor_1 = sc.nextDouble();
        cod_2 = sc.nextInt();
        num_2 = sc.nextInt();
        valor_2 = sc.nextDouble();

        double valor_pagar = (num_1 * valor_1) + (num_2 * valor_2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", valor_pagar);




    }

}
