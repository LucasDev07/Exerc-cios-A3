package nivel4;
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
        System.out.println("25. Determinante e inversa (n ≤ 5)");
        System.out.println("26. Multiplicação de matrizes otimizada por cache");
        System.out.println("27. Produto escalar e projeção");
        System.out.println("28. Classificação de notas (vetores de structs/objetos)");
        System.out.println("29. Convolução 2D com múltiplos canais (RGB)");
        System.out.println("30. Janelamento deslizante (sliding window) em vetor");
        System.out.println("----------------------------------------");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 25 -> System.out.println("Em construção"); //new Exercicio25().executar();
            case 26 -> System.out.println("Em construção"); //new Exercicio26().executar(); 
            case 27 -> System.out.println("Em construção"); //new Exercicio27().executar(); 
            case 28 -> System.out.println("Em construção"); //new Exercicio28().executar(); 
            case 29 -> System.out.println("Em construção"); //new Exercicio29().executar(); 
            case 30 -> System.out.println("Em construção"); //new Exercicio30().executar(); 
            default -> System.out.println("Opção inválida. Digite um número entre 25 e 30.");
        }
    }
}