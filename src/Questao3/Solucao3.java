package Questao3;


//Uma família está dividindo uma pizza entre seus membros.

// Crie um programa que solicite o número de membros da família e o número de fatias da pizza.

// O programa deve calcular quantas fatias cada membro vai receber, e informar se haverá sobras e quantas fatias sobrarão.

// Se a pizza não puder ser igualmente dividida, o programa deve sugerir quantas fatias adicionais são necessárias para que

// odos recebam a mesma quantidade.
public class Solucao3 {

    public static void Pizza(double[] input) {

        double membrosDaFamilia = input[0];
        double numeroDeFatias = input[1];

        //calculo para retornar a quantidade de fatias por pessoa
        double quantidadePorPessoa = numeroDeFatias / membrosDaFamilia;


        // calculo para verificar restamte de pedaços
        double fatiasAParte = numeroDeFatias % membrosDaFamilia;

        // Se houver sobras, informar o número de fatias restantes
        System.out.println("Cada membro fica com: " + quantidadePorPessoa + " fatias.");
        System.out.println("Sobrarão " + fatiasAParte + " fatias.");

        // Se não for possível dividir igualmente, sugerir fatias adicionais

        // a classe "Math.ceil" é utilizada para arredondar o numero para o mais proximo do numero maior inteiro

        System.out.println("Cada pessoa da família receberá " + numeroDeFatias + (" fatia(s)"));

        if (fatiasAParte == 0) {
            System.out.println("A pizza foi dividida igualmente entre as pessoas da família, sem sobras.");
        } else {
            System.out.println("Sobrarão " + fatiasAParte + " fatias");

            double fatiasNecessarias = membrosDaFamilia - fatiasAParte;
            System.out.println("Serão necessárias: " + fatiasNecessarias + " fatia para que todos recebam a mesma quantidade.");
        }
    }
}



