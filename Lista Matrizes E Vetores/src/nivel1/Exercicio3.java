package nivel1;
import  java.util.Random;

public class Exercicio3 {

    // Método principal deste exercício que será chamado pelo seu Menu
    public void executar() {
        System.out.println("Exercício 3: Contar ocorrências de um valor X"); 
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 5;
        int [] vetor = new int[10];

        //valor a ser comparado:
        int aux_val = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
        
        //montagem do vetor
        System.out.print("Vetor: [");
        for(int i = 0; i<10 ; i ++){
            vetor[i] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
            System.out.print(vetor[i]);
            if(i< vetor.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");
        System.out.println("Iremos contar as ocorrências do valor :" + aux_val);
        
        int aux_indice = 0;
        int [] aux_vetor = new int[10];
        int count = 0;
        //montagem da resposta
        System.out.print("Ele ocorre nos índices: ");
        for(int i = 0; i<10; i ++){
            if(vetor[i] == aux_val){
                aux_vetor[aux_indice] = i;
                count ++;
                System.out.print(i + ",");
                aux_indice ++;
            }

    }
    System.out.println("\nO número "+aux_val + " é exibido " + count + " vezes.");

}}