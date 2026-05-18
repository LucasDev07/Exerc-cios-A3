package nivel2;
import java.util.Scanner;

public class Menu{
    public static void exibir() {
        Scanner scanner = new Scanner(System.in);
        int opcao; 
        
        System.out.println("Nível 2 selecionado."); 
        System.out.println("Qual exercício gostaria de realizar?");
        System.out.println("9: Soma e produto de matrizes");
        System.out.println("10: Transposta de uma matriz");
        System.out.println("11: Matriz identidade e diagonal");
        System.out.println("12: Soma por linhas e colunas");
        System.out.println("13: Busca em matriz ordenada por linhas e colunas");
        System.out.println("14: Rotação de matriz 90°");
        System.out.println("15: Convolução simples (filtro 3 por 3)");
        System.out.println("----------------------------------------");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 9  -> new Exercicio9().executar();
            case 10 -> System.out.println("Em construção"); //new Exercicio10().executar(); 
            case 11 -> System.out.println("Em construção"); //new Exercicio11().executar(); 
            case 12 -> new Exercicio12().executar(); 
            case 13 -> System.out.println("Em construção"); //new Exercicio13().executar(); 
            case 14 -> new Exercicio14().executar(); 
            case 15 -> System.out.println("Em construção"); //new Exercicio15().executar(); 
            default -> System.out.println("Opção inválida. Digite um número entre 9 e 15.");
        }
    }
}