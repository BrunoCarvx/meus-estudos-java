//importar Scanner para ter entrada no terminal
import java.util.Scanner;

public class MediaNotas{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        //variaveis
        double[] notas = new double[5];
        double soma = 0;

        //loop para perguntar a nota de cada aluno
        for (int i = 0; i < 5; i++){
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
            soma = soma + notas[i];
        }

        leitor.close();

        double media = soma/5;
        System.out.println("A média da turma é " + media + ".");

        System.out.println("alunos acima da media:");

        for (int i = 0; i < 5; i++){
            if (notas[i] >= media){
                System.out.println("Aluno " + (i +1) + "--> " + notas[i]);
            }
        }

        System.out.println("alunos abaixo da media:");

        for (int i = 0; i < 5; i++){
            if (notas[i] < media){
                System.out.println("Aluno " + (i +1) + "--> " + notas[i]);
            }
        }
    }
}