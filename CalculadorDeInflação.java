import java.util.Scanner;
import java.util.ArrayList;

class CalculadorDeInflação {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        System.out.println("Digite o nome do produto, e digite fim para finalizar.");

        while(true){
            System.out.print("Nome do produto: ");
            String produto = leitor.nextLine();

            if (produto.equalsIgnoreCase("fim")){
                break;
            }
            System.out.print("Preço do produto: ");
            double preco = Double.parseDouble(leitor.nextLine());

            produtos.add(produto);
            precos.add(preco);
        }

        System.out.print("Porcentagem de aumento: ");
        double porcentagem = leitor.nextDouble();

        for (int i = 0; i < produtos.size(); i++){

            if (porcentagem != 0) {
                double novopreco = precos.get(i) + (precos.get(i) * porcentagem) / 100;
                System.out.println(produtos.get(i) + " passou de " + precos.get(i) + "R$ para " + novopreco + "R$. ");
            }
            else{
                System.out.print("Os produtos mantiveram o mesmo preço.");
                break;
            }


        }
    }
}