package Questao3;

import static Questao3.Solucao3.Pizza;

public class Main3 {
    public static void main(String[] args) {
        double[] input = {4, 9};  // 4 membros e 9 fatias
        Pizza(input);  // Chama o metodo para calcular

        //exemplo para testar quantidade corretas
        input = new double[]{2, 8};
        Pizza(input);  // Chama o metodo para calcular
    }
}

