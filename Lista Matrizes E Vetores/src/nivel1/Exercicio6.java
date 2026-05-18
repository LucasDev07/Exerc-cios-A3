package nivel1;
import  java.util.Random;

public class Exercicio6 {

    // Método principal deste exercício que será chamado pelo seu Menu
    public void executar() {
       System.out.println("Exercício 6: Rotação de um vetor");
        //rotacionando um vetor de inteiros:

        //inicializa variáveis
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 5;
        int [] vetor = new int[5];
        int [] vet_resultado = new int[5];
        int aux_rotacao = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
        
        //exibe o vetor origem
        vetor = new int[]{1, 2, 3, 4, 5};
        System.out.print("Vetor rotacionado: [");
        for(int i = 0; i<5 ; i ++){
            System.out.print(vetor[i]);
            if(i< vetor.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");
        
        //exibe o valor da rotação:
        System.out.println("Vetor rotaciocionado " + aux_rotacao + " vezes.");

        //realiza a conversao
        for(int i = 0; i<5 ; i ++){
            if(i+ aux_rotacao <= vetor.length -1){
                vet_resultado[i+ aux_rotacao] = vetor[i];
            }else{
                int aux_modulo = 1;
                if(i+aux_rotacao - vetor.length <0){
                    aux_modulo = -1;
                }
                vet_resultado[(i+aux_rotacao - vetor.length)*(aux_modulo)] = vetor[i];
                }
        }
        
        //exibe a conversao
        System.out.print("Vetor rotacionado: [");
        for(int i = 0; i<5 ; i ++){
            System.out.print(vet_resultado[i]);
            if(i< vetor.length -1){
               System.out.print( ",");
            } 
        }
        System.out.println("]\n");

        //rotacionando uma string
    
}}