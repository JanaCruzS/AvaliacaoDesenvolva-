package Questao2;


import java.util.Scanner;

//Dada uma turma de alunos com N alunos,
// sendo que essa quantidade deve ser solicitadae definida pelo usuário,
// solicite o nome e a nota de cada um dos alunos.
// Seu programa deve imprimir apenas aqueles alunos que tiraram nota maior que a média da nota de todos os alunos.
public class Solucao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "Digite o total de alunos");

        int totalDeAlunos = scan.nextInt();

        //nomes e notas
        String[] nomesDeAlunos = new String[totalDeAlunos];

        //cada quantidade de nomes a mesma quantidade de notas serão criadas
        double[] notas = new double[totalDeAlunos];


        double somaDeNotas = 0;

        for (int i = 0; i < totalDeAlunos; i++ ) {
            System.out.println( "Escreva o nome do aluno: " + nomesDeAlunos [i] );

            notas [i] = scan.nextDouble();
            somaDeNotas += notas[i];
        }

        //media de notas
        double media = somaDeNotas / totalDeAlunos;

        System.out.println(media);

        //Não consegui solucionar como devolver o nome do aluno
        //codigo retorna uma exeção apos nome do aluno

        }
    }


