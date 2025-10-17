public class Elemento {
    // Atributos para o Histórico de Solicitações (Pilha)
    String idSolicitacao;
    String descricao;
    String dataHora;

    // Atributos para a Fila de Atendimento
    String idCliente;
    String nomeCliente;
    String motivoAtendimento;

    private Elemento() { }

    // 1. Método para criar um Elemento  Solicitação
    public static Elemento criarSolicitacao(String id, String descricao, String dataHora) {
        Elemento e = new Elemento();
        e.idSolicitacao = id;
        e.descricao = descricao;
        e.dataHora = dataHora;
        return e;
    }

    // 2. Método para criar um Elemento Cliente
    public static Elemento criarCliente(String id, String nome, String motivo) {
        Elemento e = new Elemento();
        e.idCliente = id;
        e.nomeCliente = nome;
        e.motivoAtendimento = motivo;
        return e;
    }
}