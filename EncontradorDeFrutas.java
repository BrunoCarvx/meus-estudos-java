import java.util.Scanner;

public class EncontradorDeFrutas{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        //variáveis
        String[] frutas = {"Banana", "Uva", "Maçã", "Pêra", "Abacaxi"};
        boolean encontrei = false;

        System.out.print("Diga uma fruta para eu ver se tenho. (digite corretamente): ");
        String frutaDigitada = leitor.nextLine();

        leitor.close();

        for (int i = 0; i < 5; i++){
            if (frutas[i].equals(frutaDigitada)){
                encontrei = true;
                break;
            }
        }

        if (encontrei){
            System.out.println("Encontrei!");
        }
        else{
            System.out.println("Não encontrei :(");
        }
    }
}

