package nivel1;
import  java.util.Random;

public class Exercicio7 {

    // Método principal deste exercício que será chamado pelo seu Menu
    public void executar() {
        System.out.println("Exercício 7: Intercalar dois vetores ordenados");
        //inicializa variaveis
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 100;
        int [] vetor_1 = new int[5];
        int [] vetor_2 = new int[5];
        int [] vet_resultado = new int[vetor_1.length + vetor_2.length];
        
        //monta e exibe vetor 1
        System.out.print("Vetor_1: [");
        for(int i = 0; i< vetor_1.length ; i ++){
            vetor_1[i] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
            System.out.print(vetor_1[i]);
            if(i< vetor_1.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");
        //monta e exibe vetor 2
        System.out.print("Vetor_2: [");
        for(int i = 0; i<vetor_2.length ; i ++){
            vetor_2[i] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
            System.out.print(vetor_2[i]);
            if(i< vetor_2.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");
        //monta e exibe o vetor resultado
        int x=0; //incrementa indice do vetor resultado
        System.out.print("Vetor resultado: [");
        for(int i = 0; i < vetor_1.length; i++){
            vet_resultado[x] = vetor_1[i];
            System.out.print(vet_resultado[x] + ",");
            x++;
            vet_resultado[x] = vetor_2[i];
            System.out.print(vet_resultado[x]);
            x++;
            if(x< vet_resultado.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");
    }
}