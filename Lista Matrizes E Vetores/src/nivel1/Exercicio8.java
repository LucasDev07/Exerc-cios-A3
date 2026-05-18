package nivel1;

import java.util.Random;

public class Exercicio8 {

    // Método principal deste exercício que será chamado pelo seu Menu
    //contém erros
    public void executar() {
        System.out.println("Exercício 8: Busca linear e binária:");
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 10;
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // vetor onde será realizada a busca
        int count = 0;

        // exibe o vetor
        System.out.print("[ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.print("]");

        // valor a ser buscado:
        int input = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
        System.out.println("Número a ser buscado: " + input);

        System.out.println("Busca linear:");
        for (int i = 0; i < A.length; i++) {
            count++;
            if (A[i] == input) {
                System.out.println("Número encontrado!\nQuantidade de comparações = " + (count));
            }
        }

        System.out.println("Busca binária:");
        int inicio = 0, fim = A.length - 1, mid;
        count = 0;
        while (inicio <= fim) {
            mid = inicio + (fim - inicio) / 2;
            if (input == A[mid]) {
                System.out.println("Número encontrado (V[" + mid + "])!\nQuantidade de comparações = " + (count + 1));
                break;
            } else if (input < A[mid]) {
                fim = mid - 1;
                count++;
            } else {
                inicio = mid + 1;
                count++;
            }
        }
    }
}