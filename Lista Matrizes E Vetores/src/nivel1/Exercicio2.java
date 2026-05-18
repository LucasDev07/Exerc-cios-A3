package nivel1;
import  java.util.Random;

public class Exercicio2 {
    // Método principal deste exercício que será chamado pelo seu Menu
    public void executar() {
        System.out.println("Exercício 2: Maior e menor elemento de um vetor");
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 100;
        int [] vetor = new int[10];
        int aux_val = 0;
        int aux_indice = 0;

        System.out.println("Vetor de números aleatórios:");

        for(int i = 0; i<10 ; i ++){
            vetor[i] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
            System.out.print(vetor[i]);
            if(i< vetor.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("");

        //calcula e imprime maior valor
        for(int i = 0; i<10 ; i ++){
            if(vetor[i]> aux_val){
                aux_val = vetor[i];
                aux_indice = i;
           }
        }
        System.out.println("Maior valor do vetor: " + aux_val + "\nÍndice: " + aux_indice);

       //calcula e imprime menor valor
        for(int i = 0; i<10 ; i ++){
           if(vetor[i]< aux_val){
                aux_val = vetor[i];
                aux_indice = i;
           }
        }
        System.out.println("Menor valor deste vetor: "  + aux_val + "\nÍndice: " + aux_indice);
        
}}