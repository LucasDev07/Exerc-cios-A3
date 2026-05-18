package nivel1;
import java.util.Scanner;

public class Exercicio1 {

    // Método principal deste exercício que será chamado pelo seu Menu
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercício 1: Soma e média de um vetor");
        System.out.print("Digite a quantidade de notas: ");
        int quantidade = scanner.nextInt();
        double[] notas = new double[quantidade];
        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / quantidade;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        System.out.println("Variação: quantas notas estão acima da média e quantas estão abaixo da média?");
        int acimaMedia = 0;
        int abaixoMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            }
        }
        System.out.println("Notas acima da média: " + acimaMedia);
        System.out.println("Notas abaixo da média: " + abaixoMedia);
    }   
}