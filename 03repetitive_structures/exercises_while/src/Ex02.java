import java.security.KeyStore;
import java.util.Scanner;

/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */
public class Ex02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.println("Escreva a cordenada 'x' do plano cartesiano: ");
        x = sc.nextInt();
        System.out.println("Escreva a cordenada 'y' do plano cartesiano: ");
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0 ){
                System.out.println("Q1");
            } else if (x < 0 && y > 0 ){
                System.out.println("Q2");
            } else if (x < 0 && y < 0 ){
                System.out.println("Q3");
            } else if (x > 0 && y < 0 ){
                System.out.println("Q4");
            }
            System.out.println("Escreva a cordenada 'x' do plano cartesiano: ");
            x = sc.nextInt();
            System.out.println("Escreva a cordenada 'y' do plano cartesiano: ");
            y = sc.nextInt();


        }


    }
}
