package nivel2;

public class Exercicio14 {
    public void executar(){
        System.out.println("14: Rotação de matriz 90º");
        int [][] matriz_a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // origem
        int [][] matriz_b = new int [3][3]; // resultado

        //exibe matriz original
        System.out.println("Matriz original");
        exibeMatriz(matriz_a);

        //rotação no sentido horario
        for(int i = 0; i< 3; i++){
            for(int x = 0; x< 3; x++){
                matriz_b[x][2-i] = matriz_a[i][x];
            }
        }
        //exibe matriz b
        System.out.println("Matriz rotacionada no sentido horário");
        exibeMatriz(matriz_b);

        //rotacao no sentido anti-horario
        for(int i = 0; i< 3; i++){
            for(int x = 0; x< 3; x++){
                matriz_b[2-x][i] = matriz_a[i][x];
            }
        }
        //exibe matriz b
        System.out.println("Matriz rotacionada no sentido horário");
        exibeMatriz(matriz_b);
    }
    public void exibeMatriz(int [][] matriz){
        for(int i = 0; i< 3; i++){
            for(int x = 0; x< 3; x++){
               System.out.print(matriz[i][x]+ " "); 
            }
             System.out.println();
        }
    System.out.println();      
    }
}
