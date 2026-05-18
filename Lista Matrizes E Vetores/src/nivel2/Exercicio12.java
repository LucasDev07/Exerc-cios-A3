package nivel2;
import  java.util.Random;

public class Exercicio12 {
    public void executar(){
        Random aleatorio = new Random();
        int val_aleat_min = 1;
        int val_aleat_max = 9;
        int [][] matriz_a = new int[5][5];
        int [][] matriz_b = new int[5][5];
        int soma_linha [] = new int[5];
        int soma_coluna[] = new int[5];
        int v_maior_linha = 0;
        int v_maior_coluna = 0;
        int p_maior_linha = 0;
        int p_maior_coluna =0;

        System.out.println("Exercício 12: Soma de linhas e colunas de matrizes diferentes");
        //monta matrizes
        System.out.println("Matriz A:");
                for(int i=0; i< matriz_a.length; i++){
            for(int x = 0; x < matriz_a[i].length; x ++){
                matriz_a[i][x] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
                System.out.print(matriz_a[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println("");

        System.out.println("Matriz B:");
        for(int i=0; i< matriz_b.length; i++){
            for(int x = 0; x < matriz_b[i].length; x ++){
                matriz_b[i][x] = aleatorio.nextInt((val_aleat_max - val_aleat_min) + 1) + val_aleat_min;
                System.out.print(matriz_b[i][x] + " ");
            }
            System.out.println();
        }
        //soma linhas
        System.out.println("Soma as linhas da matriz A com as linhas da matriz B:");
        for(int i =0; i< soma_linha.length;i++){
            for(int x =0; x< soma_linha.length; x++){
                soma_linha[i] = soma_linha[i] + matriz_a[i][x] + matriz_b[i][x];
            }
        }
        System.out.print("[ " );
        for(int i =0; i< soma_linha.length;i++){
            System.out.print(soma_linha[i]+ " ");
        }
        System.out.print("]" );
        System.out.println();

        //soma colunas
        System.out.println("Soma as colunas da matriz A com as colunas da matriz B:");
        for(int i =0; i< soma_coluna.length;i++){
            for(int x =0; x< soma_coluna.length; x++){
                soma_coluna[i] = soma_coluna[i] + matriz_a[x][i] + matriz_b[x][i];
            }
        }
        System.out.print("[ " );
        for(int i =0; i< soma_coluna.length;i++){
            System.out.print(soma_coluna[i]+ " ");
        }
        System.out.print("]" );
        System.out.println();
        // busca posiçao da maior linha
        for(int i =0; i< soma_linha.length;i++){
            if(soma_linha[i] > v_maior_linha){
                v_maior_linha = soma_linha[i];
                p_maior_linha = i;
            }
        }
        // busca posiçao da maior coluna
        for(int i =0; i< soma_coluna.length;i++){
            if(soma_coluna[i] > v_maior_linha){
                v_maior_coluna = soma_coluna[i];
                p_maior_coluna = i;
            }
        }
        //exibe as maiores posições
        System.out.println("Maior soma de linhas: "+ v_maior_linha + " Posição em que se encontra: " + p_maior_linha);
        System.out.println("Maior soma de colunas: "+ v_maior_coluna + " Posição em que se encontra: " + p_maior_coluna);
    }
}