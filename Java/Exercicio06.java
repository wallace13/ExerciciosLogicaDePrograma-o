package Java;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] valores = new int[5];
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe um valor: ");
            valores[i] = scanner.nextInt();
            soma = soma +valores[i];
        }
        System.out.println("\nSoma: "+soma);

        scanner.close();
    }
}
