package nivel1;
import java.util.Scanner;

public class Menu{
    public static void exibir() {
        Scanner scanner = new Scanner(System.in);
        int opcao; 
        
        System.out.println("Nível 1 selecionado."); 
        System.out.println("Qual exercício gostaria de realizar?");
        System.out.println("1: Soma e média de um vetor");
        System.out.println("2: Maior e menor elemento de um vetor");
        System.out.println("3: Contar ocorrências de um valor");
        System.out.println("4: Inverter vetor in-place");
        System.out.println("5: Remover duplicatas (sem ordenar)");
        System.out.println("6: Rotação de vetor");
        System.out.println("7: Intercalar dois vetores ordenados");
        System.out.println("8: Busca linear e binária");
        System.out.println("----------------------------------------");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> new Exercicio1().executar();
            case 2 -> new Exercicio2().executar(); 
            case 3 -> new Exercicio3().executar(); 
            case 4 -> new Exercicio4().executar(); 
            case 5 -> new Exercicio5().executar(); 
            case 6 -> new Exercicio6().executar(); 
            case 7 -> new Exercicio7().executar(); 
            case 8 -> new Exercicio8().executar(); 

            default -> System.out.println("Opção inválida. Digite um número entre 1 e 9.");
        }
    }
}