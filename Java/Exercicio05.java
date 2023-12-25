package Java;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("Codigo - Opção");
		System.out.println("1 - Incluir\n2 - Alterar\n3 - Excluir\n4 - Pesquisar\n5 - Sair");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número do seu codigo: ");
        int codigo = 0;
        codigo = scanner.nextInt();
        switch (codigo) {
        case 1:
            System.out.println("Incluir");
            break;
        case 2:
            System.out.println("Alterar");
            break;
        case 3:
            System.out.println("Excluir");
            break;
        case 4:
            System.out.println("Pesquisar");
            break;
        case 5:
            System.out.println("Sair");
            break;
        default:
            System.out.println("Opção não existe no Menu");
        }
        scanner.close();
    }
}
