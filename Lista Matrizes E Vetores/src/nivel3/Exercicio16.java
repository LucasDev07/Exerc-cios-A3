package nivel3;
import java.util.Scanner; 

public class Exercicio16 {
    public void executar(){
        String [][] campo = new String[3][3];
        int jogoFinalizado = 0;
        System.out.println("Exercício 16: jogo da velha");
        //monta o campo 
        montaCampo(campo);
        exibeCampo(campo);

        System.out.println("Vamos começar:");
       //inicia o jogo 
        while (jogoFinalizado == 0){
            int movValido = 0; // 0 = mov inválido 1 = mov válido
            String jogada;
            do{
                jogada = jogador(1); //captura o retorno da função jogador
                movValido = addMovimento(jogada, campo);
                if(movValido == 0){
                    System.err.println("Movimento inválido, insira uma nova posição para o jogador 1 (X)");
                }
            }while(movValido == 0);
            
            exibeCampo(campo);
            movValido = 0;
            jogoFinalizado = encerraJogo(campo);
            if(jogoFinalizado ==1){
                break;
            }

            do{
                jogada = jogador(2); //captura o retorno da função jogador
                movValido = addMovimento(jogada, campo);
                if(movValido == 0){
                    System.err.println("Movimento inválido, insira uma nova posição para o jogador 2 (O)");
                }
            }while(movValido ==0);
            exibeCampo(campo);
            jogoFinalizado = encerraJogo(campo);
        }
        System.out.println("Jogo encerrado");
    }
    
    
    public void montaCampo(String [][] campo){
        for(int i=0; i< campo.length; i++){
            for(int x = 0; x < campo[i].length; x ++){
                campo[i][x]= " ";
            }
        }
    }

    public void exibeCampo(String [][] campo){
         System.out.println("Campo");
        for(int i=0; i< campo.length; i++){
            for(int x = 0; x < campo[i].length; x ++){
                System.out.print(campo[i][x]);
                if(x < campo[x].length - 1){
                    System.out.print("|");
                }
            }
            if(i < campo[i].length - 1){
                System.out.println("\n-|-|-");
            }
        }
        System.out.println("");
    }
    public String jogador(int jogador){ //funcao devera retornar uma string ex: 'X21'
        Scanner scanner = new Scanner(System.in);
        String letra;
        String linha= "";
        String coluna= "";
        String retorna = "";
        if (jogador == 1){
            letra = "X";
        }else{
            letra= "O";
        }

        System.out.println("Rodada do Jogador " + jogador + " (" + letra+ ").");
        //usuario informa linha
        while(!linha.matches("[0-2]")){
            System.out.println("Escolha a linha: (valores de 0 até 2)");
            linha = scanner.nextLine();
        }
        //usuario informa coluna
        while(!coluna.matches("[0-2]")){
            System.out.println("Escolha a coluna: (valores de 0 até 2)");
            coluna = scanner.nextLine();
        }
        //retorna string
        retorna = letra + linha + coluna;        
        return retorna;
    }   

    public int addMovimento(String player, String [][] campo){
        
        int validaMov = 0; // inicializa como inválido
        //aqui será feito um substr de cada um dos caracteres recebidos
        String letra = player.substring(0,1);
        int linha = Integer.parseInt(player.substring(1,2));
        int coluna = Integer.parseInt(player.substring(2,3));

        if(campo[linha][coluna].isBlank()){
            campo[linha][coluna] = letra;
            validaMov = 1;
        }
        return validaMov;
    }
    public int encerraJogo(String [][] campo){
        //valida linha
        for(int i = 0; i < campo.length; i++){
            for(int x = 0; x  < campo.length; x ++){
                if(campo[i][x].isBlank()){
                    break;
                }if (x > 1) {
                    if(campo[i][x].equals(campo[i][x-1]) && campo[i][x].equals(campo[i][x-2])){
                        parabenizaVencedor(campo[i][x]);
                        return 1;
                    }
                } 
            }
        }

        //valida coluna
        for(int i = 0; i < campo.length; i++){
            for(int x = 0; x  < campo.length; x ++){
                if(campo[x][i].isBlank()){
                    break;
                }if (x > 1) {
                   if(campo[x][i].equals(campo[x-1][i]) && campo[x][i].equals(campo[x-2][i])){
                        parabenizaVencedor(campo[x][i]);
                        return 1;
                    }
                } 
            }
        }
        //verifica diagonal 1
        for(int i = 0; i  < campo.length; i ++){
            if(campo[i][i].isBlank()){
                break;
            }if (i >1) {
                if(campo[i][i].equals(campo[i-1][i-1]) && campo[i][i].equals(campo[i-2][i-2])){
                    parabenizaVencedor(campo[i][i]);
                    return 1;
                }
            }  
        }
        //verifica diagonal 2
        if(!campo[0][2].isBlank() && !campo[1][1].isBlank() && !campo[0][2].isBlank()){
            if(campo[0][2].equals(campo[1][1]) && campo[0][2].equals(campo[2][0])){
                parabenizaVencedor(campo[0][2]);
                return 1;
            }
        }

        //verifica se todos os campos estão preenchidos sem um vencedor
        for(int i=0; i< campo.length; i++){
            for(int x = 0; x < campo[i].length; x ++){
                if(!campo[i][x].isBlank()){
                    return 0; //quando achar campo em branco encerra a função
                }
            }
        }
        return 1;
    }

    public void parabenizaVencedor(String player){ 
        if(player.equals("X")){
            System.out.println("Parabéns Jogador 1 (X) foi o vencedor!!");
        }else{
            System.out.println("Parabéns Jogador 2 (O) foi o vencedor!!");
        }
    }
}

