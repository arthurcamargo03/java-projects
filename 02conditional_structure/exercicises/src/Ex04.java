/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Scanner;

public class Ex04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i,f,duracao;
            System.out.println("Horário inicial de um jogo");
            i = sc.nextInt();
            System.out.println("Hora final: ");
            f = sc.nextInt();
            duracao = f - i;
            if (f == i){
                System.out.println("Tempo de duração 24 horas");
            }
            else if(f > i){
                duracao = f - i;
                System.out.printf("Tempo de duração: %d horas",duracao);
                if (duracao < 1){
                System.out.println("Tempo de duração mínimo é 1 hora");
            }
            }
            
            else if (f < i){
            duracao = (24 - i) + f;
            System.out.printf("Tempo de duração: %d horas",duracao);
            if (duracao < 1){
                System.out.println("Tempo de duração mínimo é 1 hora");

            }

            }

        }

}
