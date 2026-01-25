import java.util.Scanner;

public class DetectorDeTriangulo {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);

        //Variáveis dos lados do triângulo

        System.out.print("Lado A: ");
        double ladoA = leitor.nextDouble();

        System.out.print("Lado B: ");
        double ladoB = leitor.nextDouble();

        System.out.print("Lado C: ");
        double ladoC = leitor.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoC + ladoB > ladoA) {

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        }
        else{
            System.out.println("Os valores não formam um triângulo.");
        }

        leitor.close();
    }
}