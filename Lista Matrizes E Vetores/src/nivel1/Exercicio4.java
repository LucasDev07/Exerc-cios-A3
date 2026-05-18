package nivel1;
import  java.util.Random;

public class Exercicio4 {

    // Método principal deste exercício que será chamado pelo seu Menu
    public void executar() {
       
        System.out.println("Exercício 4: Inverter vetor in-place");
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 100;
        int [] vetor = new int[10];
        int aux_val = 0;
        int aux_indice = 0;

        System.out.print("Vetor de números aleatórios:\n [");
        //monta o vetor original
        for(int i = 0; i<10 ; i ++){
            vetor[i] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
            System.out.print(vetor[i]);
            if(i< vetor.length -1){
               System.out.print( ",");
            } 
        }
        System.out.print("]\n");
        //inverte os seus valores:
        for(int i = 0; i<5 ; i ++){
            int val_aux_1 = vetor[i];
            int val_aux_2 = vetor[10-1-i];
            vetor[i] = val_aux_2;
            vetor[10-1-i] = val_aux_1;
        } 

        //exibe os valores:
        System.out.print("Vetor invertido: [");
        for(int i = 0; i<10 ; i ++){
            System.out.print(vetor[i]);
            if(i< vetor.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");
}}