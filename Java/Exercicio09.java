package Java;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o valor do Cateto Adjacente? R:");
        double cateto1 = scanner.nextDouble();

        System.out.print("Qual o valor do Cateto Oposto a Hipotenusa? R:");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));

		System.out.println("Hipotenusa: "+hipotenusa);

        scanner.close();
    }
}
