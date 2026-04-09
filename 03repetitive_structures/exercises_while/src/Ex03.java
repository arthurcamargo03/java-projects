import java.util.Scanner;

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
public class Ex03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,g,d,tipo;
        a = 0;
        g = 0;
        d = 0;
        tipo = 0;
        System.out.println("Qual o tipo de combústivel que o senhor quer abastecer?");
        tipo = sc.nextInt();
        while (tipo != 1 || tipo != 2 || tipo != 3 || tipo != 4){
            if (tipo == 1){
                a +=1;
            }else if (tipo ==2){
                g += 1;
            }else if (tipo == 3){
                d += 1;
            }else if (tipo == 4){
                break;
            }
            System.out.println("Qual o tipo de combústivel que o senhor quer abastecer?");
            tipo = sc.nextInt();

        }
        System.out.printf("MUITO OBRIGADO!%nAlcool = %d%nGasolina: %d%nDiesel: %d",a,g,d);

    }
}
