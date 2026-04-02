import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String x;
        System.out.println("Escreva seu nome: ");
        x = sc.next();
        System.out.println("Voce digitou: " + x);
        int y;
        System.out.println("Escreva seu numero: ");
        y = sc.nextInt();
        System.out.println("Voce digitou: " + y);



        sc.close();
    }

}