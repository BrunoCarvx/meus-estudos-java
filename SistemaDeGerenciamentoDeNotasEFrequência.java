import java.util.Scanner;
import java.util.ArrayList;

class SistemaDeGerenciamentoDeNotasEFrequência {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Double> pctgns = new ArrayList<>();

        double soma = 0;
        double maiorNota = -1;
        ArrayList<String> melhores = new ArrayList<>();

        System.out.println("Digite: Nome/n1. Nota/n2. Presença/n3. (ou 'fim' para sair)/n4.");

        while(true){
            System.out.print("\nNome do aluno: ");
            String aluno = leitor.nextLine();
            if(aluno.equalsIgnoreCase("fim")) break;

            System.out.print("Nota: ");
            double nota = leitor.nextDouble();
            System.out.print("Presença: ");
            double pctgm = leitor.nextDouble();
            leitor.nextLine();

            alunos.add(aluno);
            notas.add(nota);
            pctgns.add(pctgm);

            soma += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
                melhores.clear();
                melhores.add(aluno);
            } else if (nota == maiorNota) {
                melhores.add(aluno);
            }
        }
        leitor.close();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum dado inserido.");
            return;
        }

        System.out.println("\nRELATÓRIO: ");
        for (int i = 0; i < alunos.size(); i++) {
            double n = notas.get(i);
            double p = pctgns.get(i);
            String status;

            if (p < 75) status = "Reprovado por falta";
            else if (n >= 7) status = "Aprovado";
            else if (n >= 5) status = "Recuperação";
            else status = "Reprovado por nota";

            System.out.println(alunos.get(i) + " -> " + status);
        }

        double media = soma / alunos.size();
        System.out.println("\nResultados Finais:");
        System.out.println("Média da turma: " + media);
        System.out.println("Melhor(es) aluno(s): " + melhores + " com " + maiorNota);
    }
}