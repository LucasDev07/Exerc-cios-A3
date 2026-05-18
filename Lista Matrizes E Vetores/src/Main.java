import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Aluno-> Henrique Grassi");
        System.out.println("RA-> 1292514910");
        System.out.println("Curso-> Análise e Desenvolvimento de Sistemas");
        System.out.println("UC-> Matemática Computacional Aplicada");
        System.out.println("--------------------------------");
        System.out.println("O sistema é um menu onde o usuário escolhe qual nível do exercício e depois qual exercício deseja resolver.");
        System.out.println("Vamos começar!");
        System.out.println("--------------------------------");

        //Enquanto valor for igual a 1 loop será executado
        int iteracao = 1;

        while (iteracao == 1) {
            int nivel;
            
            System.out.println("Escolha um nível entre 1 e 4.");
            nivel = scanner.nextInt();

            switch (nivel) {
            case 1-> nivel1.Menu.exibir();  
            case 2-> nivel2.Menu.exibir();
            case 3-> nivel3.Menu.exibir();//System.out.println("Exercício do Nível 3 selecionado."); 
            case 4-> nivel4.Menu.exibir();//System.out.println("Exercício do Nível 4 selecionado."); 
            default-> System.out.println("Opção inválida. Digite um número entre 1 e 4.");
        }
        System.out.println("Deseja realizar outro exercício? Se sim escolha o nível-> (1 - Sim, 0 - Não)");
        
        iteracao = scanner.nextInt();
        if(iteracao != 1) {
            iteracao = 0;
            }
        System.out.flush();//limpa o console
        }
    System.out.println("Programa encerrado pelo usuário.");
    scanner.close();
    }
}