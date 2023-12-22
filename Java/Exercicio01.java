package Java;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        double numero = scanner.nextDouble();

        if (numero > 20) {
            System.out.println("Metade do número é: "+(numero/2));
        } else {
            System.out.println("Número é: "+numero);
        }
    }
}
