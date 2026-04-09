import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora >= 24){
            System.out.println("Horas inválidas");
        }
        else if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else if (hora < 18){
            System.out.println("Boa tarde");

        }
        else{
            if(18 < hora && hora < 22){
                System.out.println("Boa noite!");
            }
            else{
                System.out.println("Madrugada, vai dormir!");
            }



        }

        sc.close();

    }



}