package nivel2;
import  java.util.Random;


public class Exercicio9 {
    public void executar(){
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 50;
        int [][] matriz_a = new int[3][3];
        int [][] matriz_b = new int[3][3];

        System.out.println("Exercício 9: Soma e produto de matrizes");
        System.out.println("Vetor A");
                for(int i=0; i< matriz_a.length; i++){
            for(int x = 0; x < matriz_a[i].length; x ++){
                matriz_a[i][x] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
                System.out.print(matriz_a[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println("");

        System.out.println("Vetor B");
        for(int i=0; i< matriz_b.length; i++){
            for(int x = 0; x < matriz_b[i].length; x ++){
                matriz_b[i][x] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
                System.out.print(matriz_b[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        
        System.out.println("Vetor A + Vetor B");
        for(int i=0; i< matriz_b.length; i++){
            for(int x = 0; x < matriz_b[i].length; x ++){
                System.out.print(" (" +matriz_a[i][x] + " + " + matriz_b[i][x]+ ")");
            }
            System.out.println();
        }
        System.out.println("");

        for(int i=0; i< matriz_b.length; i++){
            for(int x = 0; x < matriz_b[i].length; x ++){
                System.out.print(matriz_a[i][x] + matriz_b[i][x]+ " ");
            }
            System.out.println();
        }
        System.out.println("");

       // System.out.println("Vetor A * Vetor B");
    }
}
