package Java;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o valor do raio do circulo? R:");

        double raio = scanner.nextDouble();
        //calcula a área do círculo usando a fórmula A = π * r²
		double area = Math.PI*Math.pow(raio,2);

		System.out.println("Área é igual a: "+area);

        scanner.close();
    }
}
