package Java;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        switch (numero % 10) {
        case 0:
            System.out.println(numero+" é Múltiplo de 10");
            break;
        default:
            System.out.println(numero+" O número Digitado Não é Multiplo de 10");
        }
        scanner.close();
    }
}
