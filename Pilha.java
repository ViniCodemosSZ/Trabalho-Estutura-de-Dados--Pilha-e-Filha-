public class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void adicionar(Elemento novaSolicitacao) {
        No novoNo = new No(novaSolicitacao);
        novoNo.proximo = topo;
        topo = novoNo;
        System.out.println("Solicitação " + novaSolicitacao.idSolicitacao + " adicionada ao histórico.");
    }

    public Elemento remover() {
        if (estaVazia()) {
            System.out.println("O histórico de solicitações está vazio. Nada para remover.");
            return null;
        }

        No noRemovido = topo;
        topo = topo.proximo;
        System.out.println("Solicitação " + noRemovido.dados.idSolicitacao + " removida do histórico.");
        return noRemovido.dados;
    }

    public void mostrarHistorico() {
        if (estaVazia()) {
            System.out.println("-> Histórico de solicitações está vazio.");
            return;
        }

        System.out.println("\n--- Histórico de Solicitações ---");
        No atual = topo;
        while (atual != null) {
            Elemento e = atual.dados;
            System.out.println("ID: " + e.idSolicitacao + " | Descrição: " + e.descricao + " | Data: " + e.dataHora);
            atual = atual.proximo;
        }
        System.out.println("---------------------------------");
    }
}