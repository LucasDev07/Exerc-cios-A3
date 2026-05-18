package nivel3;
import java.util.Scanner;

//import nivel1.Exercicio1;
//import nivel1.Exercicio2;
//import nivel1.Exercicio3;
//import nivel1.Exercicio4;
//import nivel1.Exercicio5;
//import nivel1.Exercicio6;
//import nivel1.Exercicio7;

public class Menu{
    public static void exibir() {
        Scanner scanner = new Scanner(System.in);
        int opcao; 
        
        System.out.println("Nível 3 selecionado."); 
        System.out.println("Qual exercício gostaria de realizar?");
        System.out.println("16.Jogo da Velha (3 por 3)");
        System.out.println("17.Batalha Naval simplificada");
        System.out.println("18.Histogramas (frequência de valores)");
        System.out.println("19.Detecção de padrão em matriz (“word search”)");
        System.out.println("20.Compressão simples (run-length)");
        System.out.println("21.Matriz esparsa (representação compacta)");
        System.out.println("22.Diagonalização de uma matriz tridiagonal (acesso eficiente)");
        System.out.println("23.Caminho em labirinto (DFS/BFS)");
        System.out.println("24.Equilíbrio térmico (simulação)");
        System.out.println("----------------------------------------");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 16 -> new Exercicio16().executar();
            case 17 -> System.out.println("Em construção"); //new Exercicio17().executar(); 
            case 18 -> System.out.println("Em construção"); //new Exercicio18().executar(); 
            case 19 -> System.out.println("Em construção"); //new Exercicio19().executar(); 
            case 20 -> System.out.println("Em construção"); //new Exercicio20().executar(); 
            case 21 -> System.out.println("Em construção"); //new Exercicio21().executar(); 
            case 22 -> System.out.println("Em construção"); //new Exercicio22().executar(); 
            case 23 -> System.out.println("Em construção"); //new Exercicio23().executar(); 
            case 24 -> System.out.println("Em construção"); //new Exercicio24().executar(); 
            default -> System.out.println("Opção inválida. Digite um número entre 16 e 24.");
        }
    }
}