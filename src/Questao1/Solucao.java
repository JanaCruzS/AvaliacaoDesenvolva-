package Questao1;

//  Um motorista precisa abastecer seu carro para uma viagem.

// 1 ° O carro tem um consumo médio de combustível de 12 km por litro e o motorista planeja percorrer uma distância de 360 km.

// Crie um programa que solicite o preço do combustível por litro ao usuário e  calcule o custo total da viagem.

// Além disso, informe quantos litros de combustível serão necessários para completar a viagem.
public class Solucao {
    public static double Viagem(double[] input) {

  //1°
   double consumoMedio = 12.0;
   double totalDaViagem = 360.0;

   // entrada de dados preço da gasolina
   double precoDaGasolina = input [0];


   //Calculo da quantidade por litro
        double combustivelNecessario = (totalDaViagem / consumoMedio);


        // custo total da viagem
        double custoTotaldaViagem = combustivelNecessario * precoDaGasolina;
         return custoTotaldaViagem;

    }
}
