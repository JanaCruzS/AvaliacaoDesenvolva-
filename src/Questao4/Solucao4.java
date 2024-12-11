package Questao4;

import java.util.Scanner;

//Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo.
// Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo.
public class Solucao4 {
    public static void main(String[] args) {

        // entrada de dados do usuario
        Scanner scan = new Scanner(System.in);

        // numero que usuario soliciou
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        // Verificar se o número é primo inicializado com true;
        boolean ePrimo = true;

        // Verificar se é divisivel
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ePrimo = false;
                break;
            }
        }
        // mostrar resultado
        if (numero > 1 && ePrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

    }
}




