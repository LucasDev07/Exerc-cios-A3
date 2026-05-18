package nivel1;
import  java.util.Random;

public class Exercicio5 {

    // Método principal deste exercício que será chamado pelo seu Menu
    public void executar() {
        System.out.println("Exercício 5: Remover duplicatas (sem ordenar)");
        System.out.println("Em construção");
        
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 5;
        int [] vetor = new int[10];
        int [] vet_resultado = new int[10];
        int indice = 0;
        System.out.print("Vetor original: [");
        for(int i = 0; i<10 ; i ++){
            vetor[i] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
            System.out.print(vetor[i]);
            if(i< vetor.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");

        //cria vetor resultado
        for(int i=0; i <= vetor.length - 1; i++){
            int insere_num = 1; //se zero não insere, se um insere
            
            for(int x = 0; x < vetor.length; x++){
                if(vetor[i] == vet_resultado[x]){
                    insere_num =0;
                }
            }
            if(insere_num == 1){
                vet_resultado[indice] = vetor[i];
                indice++;
            }
        } 
        //exibe vetor resultado
        System.out.print("Vetor resultado: [");
        for(int i = 0; i<5 ; i ++){
            System.out.print(vet_resultado[i]);
            if(i< vet_resultado.length -1 && vet_resultado[i+1] !=0){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");
    }   
}