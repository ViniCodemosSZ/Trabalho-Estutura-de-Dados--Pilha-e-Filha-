public class Fila {
    private No frente;
    private No tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    public boolean estaVazia() {
        return frente == null;
    }

    public void adicionar(Elemento novoCliente) {
        No novoNo = new No(novoCliente);

        if (estaVazia()) {
            frente = novoNo;
            tras = novoNo;
        } else {
            tras.proximo = novoNo;
            tras = novoNo;
        }
        System.out.println("Cliente " + novoCliente.nomeCliente + " entrou na fila de atendimento.");
    }

    public Elemento atenderProximo() {
        if (estaVazia()) {
            System.out.println("A fila de atendimento está vazia. Nenhum cliente para atender.");
            return null;
        }

        No noAtendido = frente;
        frente = frente.proximo;

        if (frente == null) {
            tras = null;
        }

        System.out.println("Cliente " + noAtendido.dados.nomeCliente + " está sendo atendido.");
        return noAtendido.dados;
    }

    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("-> Fila de atendimento vazia.");
            return;
        }

        System.out.println("\n--- Fila de Atendimento Atual ---");
        No atual = frente;
        int posicao = 1;
        while (atual != null) {
            Elemento e = atual.dados;
            System.out.println(posicao + "º -> ID: " + e.idCliente + " | Nome: " + e.nomeCliente + " | Motivo: " + e.motivoAtendimento);
            atual = atual.proximo;
            posicao++;
        }
        System.out.println("---------------------------------");
    }
}