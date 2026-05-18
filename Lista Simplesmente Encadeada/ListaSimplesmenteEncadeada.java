public class ListaSimplesmenteEncadeada {

    static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    No inicio;

    public boolean listaVazia() {
        return inicio == null;
    }

    public void inserirInicio(int valor) {
        No novo = new No(valor);

        novo.proximo = inicio;
        inicio = novo;
    }

    public void inserirFinal(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No atual = inicio;

        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
    }

    public void exibir() {
        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }

    public boolean buscar(int valor) {
        No atual = inicio;

        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }

            atual = atual.proximo;
        }

        return false;
    }

    public void removerInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
        }
    }

    public void removerValor(int valor) {

        if (inicio == null) {
            return;
        }

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        No atual = inicio;

        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }

    public int contarElementos() {
        int contador = 0;

        No atual = inicio;

        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }

        return contador;
    }

    public void inverter() {
        No anterior = null;
        No atual = inicio;
        No proximo = null;

        while (atual != null) {
            proximo = atual.proximo;
            atual.proximo = anterior;
            anterior = atual;
            atual = proximo;
        }

        inicio = anterior;
    }

    public static void main(String[] args) {

        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();

        lista.inserirInicio(10);
        lista.inserirInicio(5);
        lista.inserirFinal(20);
        lista.inserirFinal(30);

        lista.exibir();

        System.out.println(lista.buscar(20));
        System.out.println(lista.buscar(100));

        System.out.println(lista.contarElementos());

        lista.removerInicio();
        lista.exibir();

        lista.removerValor(20);
        lista.exibir();

        lista.inverter();
        lista.exibir();
    }
}