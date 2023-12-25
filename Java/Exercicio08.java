package Java;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número:");
        double numero = scanner.nextDouble();

        System.out.println("A) "+numero);
		System.out.println("B) "+Math.pow(numero, 2));
		System.out.println("c) "+Math.sqrt(numero));

        scanner.close();
    }
}
