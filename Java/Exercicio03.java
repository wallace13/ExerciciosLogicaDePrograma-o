package Java;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número para a Base: ");
        int b = scanner.nextInt();

        System.out.println("Digite um Número para o Expoente: ");
        int e = scanner.nextInt();
		int i = 0;
		int x = 1;
        if (e == 0) {
            x = 1;
        } else {
           do{
                i++;
                x = x*b;
            }	while(i < e); 
        }
		System.out.println(b+" Elevado à "+ e + " = "  + x );
    }
}
