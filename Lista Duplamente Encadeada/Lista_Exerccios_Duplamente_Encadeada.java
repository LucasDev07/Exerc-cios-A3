import java.util.Scanner;

public class Lista_Exerccios_Duplamente_Encadeada {

    class No {
        int valor;
        No anterior;
        No proximo;

        No(int valor) {
            this.valor = valor;
        }
    }

    class Lista {
        No inicio;
        No fim;

        boolean estaVazia() {
            return inicio == null;
        }

        void inserirInicio(int valor) {
            No novo = new No(valor);

            if (estaVazia()) {
                inicio = fim = novo;
            } else {
                novo.proximo = inicio;
                inicio.anterior = novo;
                inicio = novo;
            }
        }

        void inserirFim(int valor) {
            No novo = new No(valor);

            if (estaVazia()) {
                inicio = fim = novo;
            } else {
                novo.anterior = fim;
                fim.proximo = novo;
                fim = novo;
            }
        }

        void imprimir() {
            No atual = inicio;

            if (atual == null) {
                System.out.println("Lista vazia!");
                return;
            }

            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }

        void removerInicio() {
            if (inicio == null) {
                System.out.println("Lista vazia!");
                return;
            }

            if (inicio.proximo == null) {
                inicio = fim = null;
                return;
            }

            inicio = inicio.proximo;
            inicio.anterior = null;
        }

        void removerFim() {
            if (fim == null) {
                System.out.println("Lista vazia!");
                return;
            }

            if (fim.anterior == null) {
                inicio = fim = null;
                return;
            }

            fim = fim.anterior;
            fim.proximo = null;
        }

        void buscaValor(int valor) {
            No atual = inicio;
            int pos = 0;
            boolean achou = false;

            while (atual != null) {
                if (atual.valor == valor) {
                    System.out.println("Encontrado na posição: " + pos);
                    achou = true;
                }
                atual = atual.proximo;
                pos++;
            }

            if (!achou) {
                System.out.println("Valor não encontrado.");
            }
        }

        void addOrdemCrescente(int valor) {
            No novo = new No(valor);

            if (inicio == null) {
                inicio = fim = novo;
                return;
            }

            if (valor < inicio.valor) {
                novo.proximo = inicio;
                inicio.anterior = novo;
                inicio = novo;
                return;
            }

            No atual = inicio;

            while (atual.proximo != null && atual.proximo.valor < valor) {
                atual = atual.proximo;
            }

            novo.proximo = atual.proximo;

            if (atual.proximo != null) {
                atual.proximo.anterior = novo;
            } else {
                fim = novo;
            }

            atual.proximo = novo;
            novo.anterior = atual;
        }

        void removerPrimeiroValor(int valor) {
            No atual = inicio;

            while (atual != null && atual.valor != valor) {
                atual = atual.proximo;
            }

            if (atual == null) return;

            if (atual == inicio) {
                removerInicio();
                return;
            }

            if (atual == fim) {
                removerFim();
                return;
            }

            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
        }

        void removerOcorrenciasValor(int valor) {
            No atual = inicio;

            while (atual != null) {
                No proximo = atual.proximo;

                if (atual.valor == valor) {

                    if (atual == inicio) {
                        removerInicio();
                    } 
                    else if (atual == fim) {
                        removerFim();
                    } 
                    else {
                        atual.anterior.proximo = atual.proximo;
                        atual.proximo.anterior = atual.anterior;
                    }
                }

                atual = proximo;
            }
        }

        int contarNos(int valor) {
            No atual = inicio;
            int numerosDeNos = 0;

            while (atual != null) {
                No proximo = atual.proximo;
                numerosDeNos++;
                atual = proximo;
            }
            return numerosDeNos;
        }

        void inverterLista() {
            No atual = inicio;
            No temp = null;

            while (atual != null) {
                temp = atual.anterior;
                atual.anterior = atual.proximo;
                atual.proximo = temp;

                atual = atual.anterior;
            }

            if (temp != null) {
                fim = inicio;
                inicio = temp.anterior;
            }
        }
        
       boolean palindromo() {
            No pontaInicio = inicio;
            No pontaFim = fim;

            while (pontaInicio != null && pontaFim != null && pontaInicio != pontaFim && pontaInicio.anterior != pontaFim) {
                if (pontaInicio.valor != pontaFim.valor) {
                    return false;
                }
                pontaInicio = pontaInicio.proximo;
                pontaFim = pontaFim.anterior;
            }

            return true;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Lista_Exerccios_Duplamente_Encadeada estrutura =
                new Lista_Exerccios_Duplamente_Encadeada();

        Lista lista = estrutura.new Lista();

        int opcao, valor;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Inserir no início");
            System.out.println("2 - Inserir no fim");
            System.out.println("3 - Imprimir lista");
            System.out.println("4 - Remover início");
            System.out.println("5 - Remover fim");
            System.out.println("6 - Buscar valor");
            System.out.println("7 - Inserir em ordem crescente");
            System.out.println("8 - Remover primeiro valor");
            System.out.println("9 - Remover TODAS ocorrências");
            System.out.println("10 - Contar nós");
            System.out.println("11 - Inverter lista");
            System.out.println("12 - Verificar palíndromo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Valor: ");
                    lista.inserirInicio(scanner.nextInt());
                    break;

                case 2:
                    System.out.print("Valor: ");
                    lista.inserirFim(scanner.nextInt());
                    break;

                case 3:
                    lista.imprimir();
                    break;

                case 4:
                    lista.removerInicio();
                    break;

                case 5:
                    lista.removerFim();
                    break;

                case 6:
                    System.out.print("Valor: ");
                    lista.buscaValor(scanner.nextInt());
                    break;

                case 7:
                    System.out.print("Valor: ");
                    lista.addOrdemCrescente(scanner.nextInt());
                    break;

                case 8:
                    System.out.print("Valor: ");
                    lista.removerPrimeiroValor(scanner.nextInt());
                    break;

                case 9:
                    System.out.print("Valor: ");
                    lista.removerOcorrenciasValor(scanner.nextInt());
                    break;

                case 10:
                    System.out.println("Quantidade de nós: " + lista.contarNos(0));
                    break;

                case 11:
                    lista.inverterLista();
                    System.out.println("Lista invertida!");
                    break;

                case 12:
                    if (lista.palindromo()) {
                        System.out.println("A lista é um palíndromo!");
                    } else {
                        System.out.println("A lista NÃO é um palíndromo!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}