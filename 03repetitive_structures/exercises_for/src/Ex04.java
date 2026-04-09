import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".


 */
public class Ex04 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for (int i=0;i<N;i++){
            double nominador = sc.nextDouble();
            double denominador = sc.nextDouble();
            if (denominador == 0){
                System.out.println("divisão impossível!");
            }
            else{
                double divisao = nominador / (denominador);
                System.out.println(divisao);
            }
        }
    }
}
